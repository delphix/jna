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

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;

/**
 * Java friendly version of the IUnknown interface.
 * 
 *
 */
@ComInterface(iid="{00000000-0000-0000-C000-000000000046}")
public interface IUnknown {
	/**
	 * Returns a proxy object for the given interface. Assuming that the
	 * interface is annotated with a ComInterface annotation that provides a
	 * valid iid.
	 * 
	 * Will throw COMException if an error occurs trying to retrieve the requested interface,
	 * see exception cause for details.  
	 * 
	 */
	<T> T queryInterface(Class<T> comInterface) throws COMException;
}
