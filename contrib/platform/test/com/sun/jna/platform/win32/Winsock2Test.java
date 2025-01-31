/* Copyright (c) 2017 Matthias Bläsing, All Rights Reserved
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
package com.sun.jna.platform.win32;

import com.sun.jna.Native;
import org.junit.Test;
import static org.junit.Assert.*;

public class Winsock2Test {
    @Test
    public void testGethostname() {
        // This needs visual inspection ...
        byte[] buffer = new byte[256];
        Winsock2.INSTANCE.gethostname(buffer, buffer.length);
        String hostname = Native.toString(buffer);
        System.out.println("Hostname: " + hostname);
        assertTrue(hostname.length() > 0);
    }

}
