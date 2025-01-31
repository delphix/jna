/* Copyright (c) 2007 Wayne Meissner, All Rights Reserved
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

/** Represents the <code>long</code> C data type, which may be 32 or 64 bits
 * on *nix-based systems.
 *
 * @author wmeissner@gmail.com
 */
public class NativeLong extends IntegerType {
    private static final long serialVersionUID = 1L;
    /** Size of a native long, in bytes. */
    public static final int SIZE = Native.LONG_SIZE;

    /** Create a zero-valued NativeLong. */
    public NativeLong() {
        this(0);
    }

    /** Create a NativeLong with the given value. */
    public NativeLong(long value) {
        this(value, false);
    }

    /** Create a NativeLong with the given value, optionally unsigned. */
    public NativeLong(long value, boolean unsigned) {
        super(SIZE, value, unsigned);
    }
}
