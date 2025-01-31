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

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

@ComInterface(iid="{0002096B-0000-0000-C000-000000000046}")
public interface ComIWorkbook {

	@ComMethod
	void Close(boolean saveChanges);

        @ComProperty
        ComIWorksheet getActiveSheet();
        
        @ComMethod
        void Save();
        
        @ComMethod
        void SaveAs(String filename);
        
        @ComProperty
        Charts getCharts();
}
