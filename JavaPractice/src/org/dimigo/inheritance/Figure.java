package org.dimigo.inheritance;

public class Figure {
	
	private int centerX;
	private int centerY;
	
	Figure()
	{
		
	}
	
	Figure(int centerX, int centerY){
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea()
	{
		return 0.0;
	}
}
