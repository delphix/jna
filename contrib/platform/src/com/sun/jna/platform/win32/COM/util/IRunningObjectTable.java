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

import java.util.List;

/**
 * Java friendly version of
 * {@link com.sun.jna.platform.win32.COM.IRunningObjectTable}
 * 
 */
public interface IRunningObjectTable {

	/**
	 * Creates and returns an enumerator of all the objects currently registered
	 * in the running object table (ROT).
	 * 
	 */
	Iterable<IDispatch> enumRunning();

	/**
	 * Gets all the active (running) objects that support the give interface.
	 * 
	 * Enumerates the running objects (via enumRunning), and returns a list of
	 * those for which queryInterface(iid) gives a valid result.
	 * 
	 * @param comInterface
	 * @return active objects
	 */
	<T> List<T> getActiveObjectsByInterface(Class<T> comInterface);
}
