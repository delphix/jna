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

public class ShortByReference extends ByReference {
    
    public ShortByReference() {
        this((short)0);
    }
    
    public ShortByReference(short value) {
        super(2);
        setValue(value);
    }
    
    public void setValue(short value) {
        getPointer().setShort(0, value);
    }
    
    public short getValue() {
        return getPointer().getShort(0);
    }
    
}
