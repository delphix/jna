/* Copyright (c) 2011 Timothy Wall, All Rights Reserved
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
package com.sun.jna.platform.wince;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.win32.W32APIOptions;

/** Definition <code>coredll.dll</code>.
    Add other win32 interface mappings as needed.
 */
public interface CoreDLL extends WinNT, Library {

    CoreDLL INSTANCE = Native.loadLibrary("coredll", CoreDLL.class, W32APIOptions.UNICODE_OPTIONS);

}
