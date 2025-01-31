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

/** Provide result conversion context for a function call. */
public class FunctionResultContext extends FromNativeContext {
    private Function function;
    private Object[] args;

    FunctionResultContext(Class<?> resultClass, Function function, Object[] args) {
        super(resultClass);
        this.function = function;
        this.args = args;
    }

    /** @return The {@link Function} that was invoked. */
    public Function getFunction() {
        return function;
    }

    /** @return The arguments used in this function call. */
    public Object[] getArguments() {
        return args;
    }
}
