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

/** Define conversion from a native type to the appropriate Java type. */
public interface FromNativeConverter {
    /** Convert the given native object into its Java representation using
     * the given context.
     */
    Object fromNative(Object nativeValue, FromNativeContext context);
    /** Indicate the native type used by this converter. */
    Class<?> nativeType();
}
