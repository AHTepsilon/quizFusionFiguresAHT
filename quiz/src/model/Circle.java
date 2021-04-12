package model;

import processing.core.PApplet;

public class Circle extends Figures
{

	public Circle(int posX, int posY, int dir, int size, int num) 
	{
		super(posX, posY, dir, size, num);
	}

	@Override
	public void paint(PApplet app) 
	{	
		app.fill(app.random(255), app.random(255), app.random(255));
		app.circle(posX, posY, size);
		
		app.fill(0);
		app.textSize(10);
		app.text(num, posX, posY);
	}

}
