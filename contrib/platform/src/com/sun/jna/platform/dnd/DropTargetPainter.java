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
package com.sun.jna.platform.dnd;

import java.awt.Point;
import java.awt.dnd.DropTargetEvent;

/** Provides a callback for {@link DropHandler} to customize drop target
 * feedback.
 * @author twall
 */
public interface DropTargetPainter {
    void paintDropTarget(DropTargetEvent e, int action, Point location);
}
