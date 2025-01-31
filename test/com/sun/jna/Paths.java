/* Copyright (c) 2013 Timothy Wall, All Rights Reserved
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

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public interface Paths {
    boolean USING_CLOVER = System.getProperty("java.class.path").indexOf("clover") != -1;
    /** Use this as a parent class loader to ensure clover can be loaded. */
    class CloverLoader extends URLClassLoader {
        public CloverLoader() throws MalformedURLException{
            this(null);
        }
        public CloverLoader(ClassLoader parent) throws MalformedURLException{
            super(new URL[] {
                    new File(USING_CLOVER ? "lib/clover.jar" : "/dev/null").toURI().toURL()
                  }, parent);
        }
    }
    String BUILDDIR = Platform.isWindowsCE() 
        ? "/Storage Card"
        : System.getProperty("jna.builddir",
                             USING_CLOVER
                             ? "build.clover" : "build");
    String CLASSES = BUILDDIR + (Platform.isWindowsCE() ? "" : "/classes");
    String JNAJAR = BUILDDIR + "/jna.jar";
    
    String TESTPATH = Platform.isWindowsCE()
        ? "/Storage Card/"
        : System.getProperty("jna.nativedir",
                             BUILDDIR + "/native-" + Platform.RESOURCE_PREFIX + "/");
    String TESTJAR = BUILDDIR + "/jna-test.jar";
}
