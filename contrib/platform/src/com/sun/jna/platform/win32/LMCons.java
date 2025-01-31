/* Copyright (c) 2010 Daniel Doubrovkine, All Rights Reserved
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
package com.sun.jna.platform.win32;

/**
 * Ported from LMCons.h.
 * @author dblock[at]dblock.org
 * Windows SDK 6.0A
 */
public interface LMCons {
    int  NETBIOS_NAME_LEN = 16;            // NetBIOS net name (bytes)

    /**
     * Value to be used with APIs which have a "preferred maximum length" parameter.
     * This value indicates that the API should just allocate "as much as it takes."
     */
    int  MAX_PREFERRED_LENGTH = -1;
}
