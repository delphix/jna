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

import com.sun.jna.platform.win32.COM.IDispatch;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;

@ComInterface
public interface Chart {
    @ComMethod
    void ChartWizard(Object Source,Object Gallery,Object Format,Object PlotBy,
            Object CategoryLabels,Object SeriesLabels,Object HasLegend,
            Object Title,Object CategoryTitle,Object ValueTitle,Object ExtraTitle);
    
    @ComMethod
    Series SeriesCollection(Object index);
    
    @ComMethod
    IDispatch Location(XlChartLocation location, String name);
}
