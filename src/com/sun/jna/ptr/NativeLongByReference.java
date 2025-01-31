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

import com.sun.jna.NativeLong;

public class NativeLongByReference extends ByReference {
    public NativeLongByReference() {
        this(new NativeLong(0));
    }
    
    public NativeLongByReference(NativeLong value) {
        super(NativeLong.SIZE);
        setValue(value);
    }
    
    public void setValue(NativeLong value) {
        getPointer().setNativeLong(0, value);
    }
    
    public NativeLong getValue() {
        return getPointer().getNativeLong(0);
    }
}
