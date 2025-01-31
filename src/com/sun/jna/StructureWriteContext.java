/* Copyright (c) 2007 Wayne Meissner, All Rights Reserved
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
package com.sun.jna;

import java.lang.reflect.Field;

/** Provide Java to native type conversion context for a {@link Structure} 
 * field write. 
 */
public class StructureWriteContext extends ToNativeContext {
    private Structure struct;
    private Field field;
    
    StructureWriteContext(Structure struct, Field field) {
        this.struct = struct;
        this.field = field;                
    }
    /** Get the {@link Structure} the field is a member of. */
    public Structure getStructure() { return struct; }
    
    /** Get the {@link Field} being written to native memory. */
    public Field getField() { return field; }
}

