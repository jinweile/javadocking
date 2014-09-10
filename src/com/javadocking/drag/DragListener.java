package com.javadocking.drag;

import java.awt.event.MouseListener;

import javax.swing.event.MouseInputListener;

/**
 * <p>
 * This is an interface for classes that can drag a {@link com.javadocking.dockable.Dockable} 
 * from one {@link com.javadocking.dock.Dock} to another dock.
 * It should be added to a java.awt.Component as mouse listener and mouse motion listener.
 * </p>
 * <p>
 * Information on using a drag listener in dockables is in 
 * <a href="http://www.javadocking.com/developerguide/dockable.html#DragListener" target="_blank">How to Use Dockables</a> in 
 * <i>The Sanaware Developer Guide</i>.
 * </p>
 * <p>
 * Typically, classes that implement this interface only listen to mouse events
 * and decide what should be done: 
 * <ul>
 * <li>start dragging 
 * <li>drag
 * <li>stop dragging
 * <li>cancel dragging
 * </ul> 
 * They delegate the implementation of those actions to a {@link com.javadocking.drag.Dragger}.
 * </p>
 * 
 * @author Heidi Rakels.
 */
public interface DragListener extends MouseListener, MouseInputListener
{

}
