/* Copyright (c) 2007 Timothy Wall, All Rights Reserved
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

package com.sun.jna;

public interface GCWaits {
    /** Amount of time to wait for GC, in ms */
    int GC_WAIT_TIMEOUT = 5000;
    /** How long to sleep between GC */
    int GC_WAIT_INTERVAL = 10;
    /** Number of times to attempt GC */
    int GC_WAITS = GC_WAIT_TIMEOUT / GC_WAIT_INTERVAL;
}