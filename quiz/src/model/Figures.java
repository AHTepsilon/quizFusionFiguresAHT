package model;
import processing.core.PApplet;

public abstract class Figures 
{
	int figureType;
	int posX, posY;
	float dir;
	int r, g, b;
	int size;

	public Figures(int posX, int posY, float dir, int r, int g, int b, int size) 
	{
		this.posX = posX;
		this.posY = posY;
		this.dir = dir;
		this.r = r;
		this.g = g;
		this.b = b;
		this.size = size;
	}
	
	public abstract void paint(PApplet app);
	
	public void move()
	{
		
	}
	
	public void fuse()
	{
		
	}
	
	public void bounce()
	{
	
	}

}
