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

public class DoubleByReference extends ByReference {
    public DoubleByReference() {
        this(0d);
    }
    
    public DoubleByReference(double value) {
        super(8);
        setValue(value);
    }
    
    public void setValue(double value) {
        getPointer().setDouble(0, value);
    }
    
    public double getValue() {
        return getPointer().getDouble(0);
    }
    
}
