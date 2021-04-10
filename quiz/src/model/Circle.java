package model;

import processing.core.PApplet;

public class Circle extends Figures
{

	public Circle(int posX, int posY, float dirX, float dirY, int r, int g, int b, int size) 
	{
		super(posX, posY, dirX, dirY, r, g, b, size);
	}

	@Override
	public void paint(PApplet app) 
	{	
		app.fill(r, g, b);
		app.circle(posX, posY, size);
	}

}
