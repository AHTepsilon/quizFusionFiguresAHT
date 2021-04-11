package model;
import processing.core.PApplet;

public abstract class Figures 
{
	int figureType;
	int posX, posY;
	float dirX, dirY;
	int r, g, b;
	int size;
	int num;

	public Figures(int posX, int posY, float dirX, float dirY, int r, int g, int b, int size, int num) 
	{
		this.posX = posX;
		this.posY = posY;
		this.dirX = dirX;
		this.dirY = dirY;
		this.r = r;
		this.g = g;
		this.b = b;
		this.size = size;
		this.num = num;
	}
	
	public abstract void paint(PApplet app);
	
	public void move(PApplet app)
	{
		int randomNumb = (int)app.random(4);
		switch (randomNumb)
		{
		case 0:
			dirX = 2;
			break;
		case 1:
			dirX = -2;
			break;
		case 2:
			dirY = 2;
			break;
		case 3:
			dirY = -2;
			break;
		case 4:
			dirX = 2;
			dirY = 2;
			break;
		}
		
		posX += dirX;
		posY += dirY;
	}
	
	public void fuse()
	{
		
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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
