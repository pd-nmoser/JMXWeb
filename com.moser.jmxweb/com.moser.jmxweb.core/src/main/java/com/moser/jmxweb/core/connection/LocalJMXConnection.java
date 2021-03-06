/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Nicolas Moser
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.moser.jmxweb.core.connection;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * LocalJMXConnection
 * <p/>
 * Author: Nicolas Moser
 * Date: 07.08.13
 * Time: 22:56
 */
class LocalJMXConnection extends JMXConnectionSupport implements JMXConnection {


	@Override
	public List<MBeanServer> getMBeanServers() throws JMXConnectionException {

		List<MBeanServer> servers = new ArrayList<MBeanServer>();

		try {
			List<MBeanServer> registeredServers = MBeanServerFactory.findMBeanServer(null);

			if (registeredServers == null || registeredServers.isEmpty()) {
				servers.add(ManagementFactory.getPlatformMBeanServer());
			} else {
				servers.addAll(registeredServers);
			}
		} catch (Exception e) {
			throw new JMXConnectionException("Error initializing local MBean Servers.", e);
		}

		return servers;
	}
}
