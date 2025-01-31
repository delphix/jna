/* Copyright (c) 2013 Tobias Wolf, All Rights Reserved
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
package com.sun.jna.platform.win32.COM;

import com.sun.jna.Function;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

public abstract class COMInvoker extends PointerType {

    protected int _invokeNativeInt(int vtableId, Object[] args) {
        Pointer vptr = this.getPointer().getPointer(0);
        // we take the vtable id and multiply with the pointer size (4 bytes on
        // 32bit OS)
        Function func = Function.getFunction(vptr.getPointer(vtableId
                * Pointer.SIZE));
        return func.invokeInt(args);
    }

    protected Object _invokeNativeObject(int vtableId, Object[] args, Class<?> returnType) {
        Pointer vptr = this.getPointer().getPointer(0);
        // we take the vtable id and multiply with the pointer size (4 bytes on
        // 32bit OS)
        Function func = Function.getFunction(vptr.getPointer(vtableId
                * Pointer.SIZE));
        return func.invoke(returnType, args);
    }

    protected void _invokeNativeVoid(int vtableId, Object[] args) {
        Pointer vptr = this.getPointer().getPointer(0);
        // we take the vtable id and multiply with the pointer size (4 bytes on
        // 32bit OS)
        Function func = Function.getFunction(vptr.getPointer(vtableId
                * Pointer.SIZE));
        func.invokeVoid(args);
    }

}
