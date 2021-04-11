package controller;
import model.Logic;
import processing.core.PApplet;

public class Controller extends PApplet
{
	int randomNum;
	Logic logical;
	PApplet app;
	
	public Controller() 
	{
		this.randomNum = (int) random(1);
		logical = new Logic(app);
	}
	
	public void mousePressed()
	{

	}

}
