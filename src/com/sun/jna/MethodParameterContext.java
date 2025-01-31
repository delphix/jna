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

import java.lang.reflect.Method;

public class MethodParameterContext extends FunctionParameterContext {
    private Method method;
    
    MethodParameterContext(Function f, Object[] args, int index, Method m) {
        super(f, args, index);
        this.method = m;
    }
    /** Get the Method in the Library instance the Function was called from. */
    public Method getMethod() { return method; }
}
