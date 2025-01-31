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
package com.sun.jna;

/** Simple wrapper class to identify a wide string argument or return type.
 * @author twall@users.sf.net
 */
public final class WString implements CharSequence, Comparable {
    private String string;
    public WString(String s){
        if (s == null) {
            throw new NullPointerException("String initializer must be non-null");
        }
        this.string = s;
    }
    @Override
    public String toString() {
        return string;
    }
    @Override
    public boolean equals(Object o) {
        return (o instanceof WString) && toString().equals(o.toString());
    }
    @Override
    public int hashCode() {
        return toString().hashCode();
    }
    @Override
    public int compareTo(Object o) {
        return toString().compareTo(o.toString());
    }
    @Override
    public int length() {
        return toString().length();
    }
    @Override
    public char charAt(int index) {
        return toString().charAt(index);
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        return toString().subSequence(start, end);
    }
}
