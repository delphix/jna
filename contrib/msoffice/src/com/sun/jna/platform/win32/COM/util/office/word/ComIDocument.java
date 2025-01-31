/* Copyright (c) 2014 Dr David H. Akehurst (itemis), All Rights Reserved
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
package com.sun.jna.platform.win32.COM.util.office.word;

import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

public interface ComIDocument {

	@ComMethod
	void SaveAs(String string, WdSaveFormat wdFormatDocument);

	@ComMethod
	void Close(boolean saveChanges);
        
        /**
         * <p>id(0x451)</p>
         */
        @ComMethod(name = "Close", dispId = 0x451)
        void Close(Object SaveChanges,
                Object OriginalFormat,
                Object RouteDocument);
        
        /**
         * <p>
         * id(0x29)</p>
         */
        @ComProperty(name = "Content", dispId = 0x29)
        Range getContent();
        
        /**
         * <p>id(0x4)</p>
         */
        @ComProperty(name = "Bookmarks", dispId = 0x4)
        Bookmarks getBookmarks();

        /**
         * <p>
         * id(0x6)</p>
         */
        @ComProperty(name = "Tables", dispId = 0x6)
        Tables getTables();
        
        /**
         * <p>id(0x228)</p>
         */
        @ComMethod(name = "ExportAsFixedFormat", dispId = 0x228)
        void ExportAsFixedFormat(String OutputFileName,
                WdExportFormat ExportFormat,
                Boolean OpenAfterExport,
                WdExportOptimizeFor OptimizeFor,
                WdExportRange Range,
                Integer From,
                Integer To,
                WdExportItem Item,
                Boolean IncludeDocProps,
                Boolean KeepIRM,
                WdExportCreateBookmarks CreateBookmarks,
                Boolean DocStructureTags,
                Boolean BitmapMissingFonts,
                Boolean UseISO19005_1,
                Object FixedFormatExtClassPtr);
}
