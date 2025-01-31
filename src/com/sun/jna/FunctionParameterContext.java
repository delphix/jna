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


public class FunctionParameterContext extends ToNativeContext {
    private Function function;
    private Object[] args;
    private int index;
    
    FunctionParameterContext(Function f, Object[] args, int index) {
        this.function = f;
        this.args = args;
        this.index = index;
    }
    /** Get the function that was invoked. */
    public Function getFunction() { return function; }
    /** Get the arguments used in this function call. */
    public Object[] getParameters() { return args; }
    public int getParameterIndex() { return index; }

}
