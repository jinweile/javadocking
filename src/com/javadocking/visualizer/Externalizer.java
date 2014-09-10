package com.javadocking.visualizer;

import java.awt.Point;

import com.javadocking.dockable.Dockable;

public interface Externalizer extends Visualizer 
{

	public void moveExternalizedDockable(Dockable dockable, Point position, Point dockableOffset);
	
}
