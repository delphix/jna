/* Copyright (c) 2009 Timothy Wall, All Rights Reserved
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

/** General structure by value functionality tests. */
public class DirectStructureByValueTest extends StructureByValueTest {

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(DirectStructureByValueTest.class);
    }

    public static class DirectTestLibrary implements TestLibrary {
        public native byte testStructureByValueArgument8(ByValue8 arg);
        public native short testStructureByValueArgument16(ByValue16 arg);
        public native int testStructureByValueArgument32(ByValue32 arg);
        public native long testStructureByValueArgument64(ByValue64 arg);
        public native long testStructureByValueArgument128(ByValue128 arg);
        static {
            Native.register("testlib");
        }
    }

    protected void setUp() {
        lib = new DirectTestLibrary();
    }
}