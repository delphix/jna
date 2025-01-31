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

package com.sun.jna.platform.win32.COM.util.office.word;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2DEF3465-D4C4-369B-B91E-68C9711F3A6C})</p>
 */
public enum WdCollapseDirection implements IComEnum {
    
    /**
     * (1)
     */
    wdCollapseStart(1),
    
    /**
     * (0)
     */
    wdCollapseEnd(0),
    ;

    private WdCollapseDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}