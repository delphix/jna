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

import com.sun.jna.Pointer;

/** Represents a reference to a pointer to native data. 
 * In C notation, <code>void**</code>.
 * @author twall
 */
public class PointerByReference extends ByReference {

    public PointerByReference() {
        this(null);
    }
    
    public PointerByReference(Pointer value) {
        super(Pointer.SIZE);
        setValue(value);
    }
    
    public void setValue(Pointer value) {
        getPointer().setPointer(0, value);
    }
    
    public Pointer getValue() {
        return getPointer().getPointer(0);
    }
}
