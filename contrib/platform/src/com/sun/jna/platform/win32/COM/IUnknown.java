/* Copyright (c) 2012 Tobias Wolf, All Rights Reserved
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

// TODO: Auto-generated Javadoc
/**
 * Wrapper class for the ITypeInfo interface
 * 
 * <table>
 * <tr><th>Method Name</th><th>V-Table Offset</th></tr>
 * <tr><td>IUnknown.QueryInterface</td><td>0</td></tr>
 * <tr><td>IUnknown.AddRef</td><td>4</td></tr>
 * <tr><td>IUnknown.Release</td><td>8</td></tr>
 * </table>
 * 
 * @author Tobias Wolf, wolf.tobias@gmx.net
 */
public interface IUnknown {

    /** The Constant IID_IDispatch. */
    public final static IID IID_IUNKNOWN = new IID(
            "{00000000-0000-0000-C000-000000000046}");

    public HRESULT QueryInterface(REFIID riid, PointerByReference ppvObject);

    public int AddRef();

    public int Release();
}
