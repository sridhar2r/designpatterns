package com.patterns.creational.prototype;// A Java program to demonstrate working of
// Prototype Design Pattern with example
// of a ColorStore class to store existing objects.

import java.util.HashMap;
import java.util.Map;


abstract class Color implements Cloneable
{

    protected String colorName;
	
	abstract void addColor();
	
	public Object clone()
	{
		Object clone = null;
		try
		{
			clone = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clone;
	}
}

class blueColor extends Color
{
	public blueColor()
	{
		this.colorName = "blue";
	}

	@Override
	void addColor()
	{
		System.out.println("Blue color added " +this.colorName);
		this.colorName = "turned blue";
	}
	
}

class blackColor extends Color{

	public blackColor()
	{
		this.colorName = "black";
	}

	@Override
	void addColor()
	{
		System.out.println("Black color added " +this.colorName);
	}
}

class ColorStore {

	private static Map<String, Color> colorMap = new HashMap<String, Color>();
	
	static
	{
		colorMap.put("blue", new blueColor());
		colorMap.put("black", new blackColor());
	}
	
	public static Color getColor(String colorName)
	{
		return (Color) colorMap.get(colorName).clone();
		//return (Color) colorMap.get(colorName);
	}
}


// Driver class
class Prototype
{
	public static void main (String[] args)
	{
		Color blue1 = ColorStore.getColor("blue");
		blue1.addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("black").addColor();
		Color blue2 = ColorStore.getColor("blue");
		blue2.addColor();

		System.out.println("----------");
		System.out.println(blue1);
		System.out.println(blue2);
		System.out.println((blue1 == blue2));
	}
}
