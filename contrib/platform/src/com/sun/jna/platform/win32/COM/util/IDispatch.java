/* Copyright (c) 2014 Dr David H. Akehurst (itemis), All Rights Reserved
 *
 * The contents of this file is licensed under
 * Apache License 2.0. (starting with JNA version 4.0.0).
 * 
 * You may obtain a copy of the Apache License at:
 * 
 * http://www.apache.org/licenses/
 * 
 * A copy is also included in the downloadable source code package
 * containing JNA, in file "AL2.0".
 */
package com.sun.jna.platform.win32.COM.util;

import com.sun.jna.platform.win32.OaIdl.DISPID;

/**
 * Java friendly version of {@link com.sun.jna.platform.win32.COM.IDispatch}.
 *
 */
public interface IDispatch extends IUnknown {
	<T> void setProperty(String name, T value);
	<T> T getProperty(Class<T> returnType, String name, Object... args);
	<T> T invokeMethod(Class<T> returnType, String name, Object... args);
	<T> void setProperty(DISPID dispid, T value);
	<T> T getProperty(Class<T> returnType, DISPID dispid, Object... args);
	<T> T invokeMethod(Class<T> returnType, DISPID dispid, Object... args);
}
