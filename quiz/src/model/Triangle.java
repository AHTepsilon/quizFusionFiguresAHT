package model;

import processing.core.PApplet;

public class Triangle extends Figures
{
	
	public Triangle(int posX, int posY, int dir, int size, int num) 
	{
		super(posX, posY, dir, size, num);
	}

	public void paint(PApplet app)
	{
		app.fill(app.random(255), app.random(255), app.random(255));
		app.triangle(posX, posY - size/2, posX - size/2, posY + size/2, posX + size / 2, posY + size/2);
		
		app.fill(0);
		app.textSize(10);
		app.text(num, posX, posY);
	}
}
