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
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

@ComInterface(iid="{000208D8-0000-0000-C000-000000000046}")
public interface ComIWorksheet {
        @ComProperty
        ComIWorkbook getParent();
    
	@ComProperty
	String getName();
	
	@ComProperty
	ComIRange getRange(String cell1);
        
        @ComProperty
        ComIRange getRange(String cell1, String cell2);

	@ComProperty
	ComIApplication getApplication();

        @ComProperty
        ComIRange getCells();
        
        @ComProperty
        Shapes getShapes();
        
	@ComProperty
	ComIRange getRows(Object identifier);
        
	@ComProperty
	ComIRange getColumns(Object identifier);
}
