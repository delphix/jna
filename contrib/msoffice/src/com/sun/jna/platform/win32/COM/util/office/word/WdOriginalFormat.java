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

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdOriginalFormat implements IComEnum {
	wdOriginalDocumentFormat(1),  // Original document format.
	wdPromptUser(2),              // Prompt user to select a document format.
	wdWordDocument(0);            // Microsoft Word document format.
	
	 private WdOriginalFormat(long value) {
		 this.value = value;
	 }
	 private long value;
	 public long getValue() {
		 return this.value;
	 }
}
