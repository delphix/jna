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
package com.sun.jna.ptr;

public class FloatByReference extends ByReference {
    public FloatByReference() {
        this(0f);
    }
    
    public FloatByReference(float value) {
        super(4);
        setValue(value);
    }
    
    public void setValue(float value) {
        getPointer().setFloat(0, value);
    }
    
    public float getValue() {
        return getPointer().getFloat(0);
    }

}
