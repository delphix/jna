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
 * <p>uuid({D67854FC-9A45-33F6-A4D3-DC0002A53CE9})</p>
 */
public enum WdExportItem implements IComEnum {
    
    /**
     * (0)
     */
    wdExportDocumentContent(0),
    
    /**
     * (7)
     */
    wdExportDocumentWithMarkup(7),
    ;

    private WdExportItem(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}