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

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;

@ComInterface(iid="{00024413-0000-0000-C000-000000000046}")
public interface ComIAppEvents {
	
	  @ComEventCallback(dispid=1558)
	  public void SheetSelectionChange(ComIWorksheet sheet, ComIRange target);

}
