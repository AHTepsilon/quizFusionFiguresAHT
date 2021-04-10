package model;

import processing.core.PApplet;

public class Triangle
{
	int x1, x2, x3, y1, y2, y3;
	int r, g, b;
	
	public Triangle(int x1, int x2, int x3, int y1, int y2, int y3, int r, int g, int b) 
	{
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public void paint(PApplet app)
	{
		app.fill(r, g, b);
		app.triangle(x1, y1, x2, y2, x3, y3);
	}
}
