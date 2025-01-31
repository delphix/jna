/* Copyright (c) 2015 Goldstein Lyor, All Rights Reserved
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
package com.sun.jna.platform.unix;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * <I>libc</I> API
 * @author Lyor Goldstein
 */
public interface LibC extends LibCAPI, Library {
    String NAME = "c";
    LibC INSTANCE = Native.loadLibrary(NAME, LibC.class);
}
