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

package com.moser.jmxweb.core.mbean;

import org.junit.Test;

import java.util.Map;

/**
 * JMXServerTest
 * <p/>
 * Author: Nicolas Moser
 * Date: 09.08.13
 * Time: 11:58
 */
public class JMXServerTest {

    @Test
    public void testDomains() throws Exception {

        JMXServer server = new JMXServer();
        Map<String, MBeanDomain> domains = server.getDomains();

        System.out.println(domains.values());

        for (MBeanDomain domain : domains.values()) {

            System.out.println(domain);

            for (MBean mbean : domain.getAllMbeans()) {
                System.out.println("\t- " + mbean);

                for(MBeanAttribute attribute : mbean.getAttributes()) {
                    System.out.println("\t\t- " + attribute);
                }

                System.out.println();

                for(MBeanOperation operation : mbean.getOperations()) {
                    System.out.println("\t\t- " + operation);
                }

                System.out.println();
            }

            System.out.println();
        }
    }

}
