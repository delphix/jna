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

public class IntByReference extends ByReference {

    public IntByReference() {
        this(0);
    }
    
    public IntByReference(int value) {
        super(4);
        setValue(value);
    }
    
    public void setValue(int value) {
        getPointer().setInt(0, value);
    }
    
    public int getValue() {
        return getPointer().getInt(0);
    }
}
