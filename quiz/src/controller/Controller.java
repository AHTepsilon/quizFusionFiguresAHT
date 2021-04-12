package controller;
import model.Circle;
import model.Logic;
import model.Square;
import processing.core.PApplet;

public class Controller extends PApplet
{
	boolean figureType;
	Logic logical;
	PApplet app;
	
	public Controller() 
	{
		logical = new Logic(app);
		logical.readValuesFromTXT();
		logical.importText();
	}
	
	public void paint()
	{
		logical.paintSq();
		logical.paintCr();
		logical.paintTr();
	}
	
	public void stopMove(int mouseX, int mouseY)
	{
		for(int i = 0; i < logical.getCircles().size(); i++)
		{
			if(dist(logical.getCircles().get(i).getPosX(), logical.getCircles().get(i).getPosY(), mouseX, mouseY) < 20)
			{
				if(logical.getCircles().get(i).getDirX() != 0 && logical.getCircles().get(i).getDirY() != 0)
				{
					logical.getCircles().get(i).setDirX(0);
					logical.getCircles().get(i).setDirY(0);
				}
				else
				{
					logical.getCircles().get(i).setDirX(random(-2, 2));
					logical.getCircles().get(i).setDirY(random(-2, 2));
				}
			}
		}
		
		for(int i = 0; i < logical.getSquares().size(); i++)
		{
			if(dist(logical.getSquares().get(i).getPosX(), logical.getSquares().get(i).getPosY(), mouseX, mouseY) < 20)
			{
				if(logical.getSquares().get(i).getDirX() != 0 && logical.getSquares().get(i).getDirY() != 0)
				{
					logical.getSquares().get(i).setDirX(0);
					logical.getSquares().get(i).setDirY(0);
				}
				else
				{
					logical.getSquares().get(i).setDirX(random(-2, 2));
					logical.getSquares().get(i).setDirY(random(-2, 2));
				}
			}
		}
	}
	
	public void newFig(int mouseX, int mouseY)
	{
		if(figureType == true)
		{
			Circle current = new Circle(mouseX, mouseY, (int) random(5, 30), (int) random(-2, 2), (int) random(30));
			
			logical.getCircles().add(current);
			figureType = false;
		}
		
		else 
		{
			Square current = new Square(mouseX, mouseY, (int) random(5, 30), (int) random(-2, 2), (int) random(30));
			
			logical.getSquares().add(current);
			figureType = true;
		}
	}

}
