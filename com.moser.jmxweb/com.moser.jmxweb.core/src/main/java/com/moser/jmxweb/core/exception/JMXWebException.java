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

package com.moser.jmxweb.core.exception;

/**
 * JMXWebException
 * <p/>
 * User: Nicolas Moser
 * Date: 07.08.13
 * Time: 00:23
 */
public class JMXWebException extends Exception {

	/**
	 * Creates the JMXWebException for an error message.
	 *
	 * @param message
	 * 		the error message
	 */
	public JMXWebException(String message) {

		super(message);
	}

	/**
	 * Creates the JMXWebException for an error cause.
	 *
	 * @param cause
	 * 		the causing error
	 */
	public JMXWebException(Exception cause) {

		super(cause);
	}

	/**
	 * Creates the JMXWebException for an error message and cause.
	 *
	 * @param message
	 * 		the error message
	 * @param cause
	 * 		the causing error
	 */
	public JMXWebException(String message, Exception cause) {

		super(message, cause);
	}


}
