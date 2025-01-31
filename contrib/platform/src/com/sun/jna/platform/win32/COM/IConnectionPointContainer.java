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
package com.sun.jna.platform.win32.COM;

import com.sun.jna.platform.win32.Guid.IID;
import com.sun.jna.platform.win32.Guid.REFIID;
import com.sun.jna.platform.win32.WinNT.HRESULT;
import com.sun.jna.ptr.PointerByReference;

public interface IConnectionPointContainer extends IUnknown {
	 public final static IID IID_IConnectionPointContainer = new IID("B196B284-BAB4-101A-B69C-00AA00341D07");
	 
	 /**
	  * {@code
	  *   HRESULT FindConnectionPoint(
	  *     [in]   REFIID riid,
	  *     [out]  IConnectionPoint **ppCP
	  *   );
	  * }
	  * @param riid
	  * @param ppCP
	  * @return hresult
	  */
	 public HRESULT FindConnectionPoint(  REFIID riid,  PointerByReference ppCP );
}
