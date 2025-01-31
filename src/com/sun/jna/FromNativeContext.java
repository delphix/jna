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

/** Provides context for converting a native value into a Java type. */
public class FromNativeContext {
    private Class<?> type;
    FromNativeContext(Class<?> javaType) {
        this.type = javaType;
    }
    /** The desired Java type of the result. */
    public Class<?> getTargetType() {
        return type;
    }
}
