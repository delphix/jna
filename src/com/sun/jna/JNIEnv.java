/*
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

/** Marker type for the JNIEnv pointer.
 * Use this to wrap native methods that take a JNIEnv* parameter.
 * Pass {@link JNIEnv#CURRENT} as the argument.
 */
public final class JNIEnv {
    /** Marker object representing the current thread's JNIEnv pointer. */
    public static final JNIEnv CURRENT = new JNIEnv();

    private JNIEnv() {}
}