/* Copyright (c) 2007-2009 Timothy Wall, All Rights Reserved
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

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.util.List;

import junit.framework.TestCase;

/** TODO: need more alignment tests, especially platform-specific behavior
 * @author twall@users.sf.net
 */
//@SuppressWarnings("unused")
public class StructureBufferFieldTest extends TestCase {

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(StructureBufferFieldTest.class);
    }

    static class BufferStructure extends Structure {
        public static final List<String> FIELDS = createFieldsOrder("buffer", "dbuffer");
        public Buffer buffer;
        public DoubleBuffer dbuffer;
        @Override
        protected List<String> getFieldOrder() {
            return FIELDS;
        }
    }
    public void testBufferFieldWriteNULL() {
        if (!Platform.HAS_BUFFERS) return;
        BufferStructure bs = new BufferStructure();
        bs.write();
    }
    public void testBufferFieldWriteNonNULL() {
        if (!Platform.HAS_BUFFERS) return;
        BufferStructure bs = new BufferStructure();
        bs.buffer = ByteBuffer.allocateDirect(16);
        bs.dbuffer = ((ByteBuffer)bs.buffer).asDoubleBuffer();
        bs.write();
    }
    public void testBufferFieldReadUnchanged() {
        if (!Platform.HAS_BUFFERS) return;
        BufferStructure bs = new BufferStructure();
        Buffer b = ByteBuffer.allocateDirect(16);
        bs.buffer = b;
        bs.dbuffer = ((ByteBuffer)bs.buffer).asDoubleBuffer();
        bs.write();
        bs.read();
        assertEquals("Buffer field should be unchanged", b, bs.buffer);
    }
    public void testBufferFieldReadChanged() {
        if (!Platform.HAS_BUFFERS) return;
        BufferStructure bs = new BufferStructure();
        if (Pointer.SIZE == 4) {
            bs.getPointer().setInt(0, 0x1);
        }
        else {
            bs.getPointer().setLong(0, 0x1);
        }
        try {
            bs.read();
            fail("Structure read should fail if Buffer pointer was set");
        }
        catch(IllegalStateException e) {
        }
        bs.buffer = ByteBuffer.allocateDirect(16);
        try {
            bs.read();
            fail("Structure read should fail if Buffer pointer has changed");
        }
        catch(IllegalStateException e) {
        }
    }
    public void testBufferFieldReadChangedToNULL() {
        if (!Platform.HAS_BUFFERS) return;
        BufferStructure bs = new BufferStructure();
        bs.buffer = ByteBuffer.allocateDirect(16);
        bs.dbuffer = ((ByteBuffer)bs.buffer).asDoubleBuffer();
        bs.read();
        assertNull("Structure Buffer field should be set null", bs.buffer);
        assertNull("Structure DoubleBuffer field should be set null", bs.dbuffer);
    }
}
