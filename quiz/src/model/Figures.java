package model;
import processing.core.PApplet;

public abstract class Figures 
{
	int posX, posY;
	int figureType;
	float dirX, dirY;
	int num;
	int size;

	public Figures(int posX, int posY, int size, int dir, int num) 
	{
		this.posX = posX;
		this.posY = posY;
		this.dirX = dir;
		this.dirY = dir;
		this.size = size;
		this.num = num;
	}
	
	public abstract void paint(PApplet app);
	
	public void move(PApplet app)
	{
		posX += dirX;
		posY += dirY;
	}
	
	public void bounce()
	{
		
		if(posX == 500)
		{
			posX = 200;
			dirX = -2;
		}
		
		if(posX == 0)
		{
			posX = 200;
			dirX = 2;
		}
		
		if(posY == 500)
		{
			posY = 200;
			dirY = -2;
		}
		
		if(posY == 0)
		{
			posY = 200;
			dirY = 2;
		}
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public float getDirX() {
		return dirX;
	}

	public void setDirX(float dirX) {
		this.dirX = dirX;
	}

	public float getDirY() {
		return dirY;
	}

	public void setDirY(float dirY) {
		this.dirY = dirY;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
