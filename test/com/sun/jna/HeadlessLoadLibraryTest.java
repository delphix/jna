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
package com.sun.jna;

import junit.framework.TestCase;

public class HeadlessLoadLibraryTest extends TestCase {
    
    public void testLoadWhenHeadless() {
        System.setProperty("java.awt.headless", "true");
        assertTrue("Pointer size must not be zero", Pointer.SIZE > 0);
    }
    
    public static void main(String[] args) {
        junit.textui.TestRunner.run(HeadlessLoadLibraryTest.class);
    }
}
