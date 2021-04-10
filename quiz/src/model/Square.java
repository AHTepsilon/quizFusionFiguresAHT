package model;

import processing.core.PApplet;

public class Square extends Figures
{

	public Square(int posX, int posY, float dir, int r, int g, int b, int size) 
	{
		super(posX, posY, dir, r, g, b, size);
	}

	@Override
	public void paint(PApplet app) 
	{
		app.fill(r, g, b);
		app.square(posX, posY, size);
	}

}
