package org.dimigo.inheritance;

public class Circle extends Figure {
	
	private int radius;
		
	Circle(int radius)
	{
		this.radius = radius;
	}
		
	Circle(int centerX, int centerY, int radius)
	{
		super(centerX, centerY);
		this.radius = radius;
	}
		
	protected double calcArea()
	{
		double i = Double.valueOf(String.format("%.1f", Math.PI * radius * radius)).doubleValue();
		return i;
	}
}
