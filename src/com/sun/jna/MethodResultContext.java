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

/** Provide result conversion context for a function call that is called via
 * a Library interface.
 */
public class MethodResultContext extends FunctionResultContext {
    private final Method method;
    MethodResultContext(Class<?> resultClass, Function function, Object[] args, Method method) {
        super(resultClass, function, args);
        this.method = method;
    }

    /** @return The {@link Method} used to invoke this function call. */
    public Method getMethod() {
        return method;
    }
}
