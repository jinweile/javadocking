package com.javadocking.mainandtool;

import java.awt.Component;

import javax.swing.Icon;

import com.javadocking.dockable.DefaultDockable;

public class TypeDockable extends DefaultDockable
{

	private boolean main;
	
	public TypeDockable(String id, Component content, String title, Icon icon, boolean main)
	{
		super(id, content, title, icon);
		this.main = main;
	}

	public TypeDockable(String id, Component content, String title, boolean main)
	{
		super(id, content, title);
		this.main = main;
	}

	public boolean getMain()
	{
		return main;
	}

	public void setMain(boolean main)
	{
		this.main = main;
	}

}
