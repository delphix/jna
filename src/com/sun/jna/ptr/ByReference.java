/* Copyright (c) 2007 Timothy Wall, All Rights Reserved
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
package com.sun.jna.ptr;

import com.sun.jna.Memory;
import com.sun.jna.PointerType;

/** Provides generic "pointer to type" functionality, often used in C
 * code to return values to the caller in addition to a function result.
 * <p>
 * Derived classes should define <code>setValue(&lt;T&gt;)</code>
 * and <code>&lt;T&gt; getValue()</code> methods which write to/read from
 * memory.
 * <p>This class derives from PointerType instead of Memory in order to
 * restrict the API to only <code>getValue/setValue</code>.
 * <p>NOTE: this class would ideally be replaced by a generic.
 */
public abstract class ByReference extends PointerType {
    
    protected ByReference(int dataSize) {
        setPointer(new Memory(dataSize));
    }
}
