/*
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

package com.sun.jna.platform.win32.COM.util.office.excel;

import com.sun.jna.platform.win32.COM.util.office.word.*;
import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlBorderWeight implements IComEnum {
    
    xlHairline(1),
    xlMedium(-4138),
    xlThick(4),
    xlThin(2);

    private XlBorderWeight(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}