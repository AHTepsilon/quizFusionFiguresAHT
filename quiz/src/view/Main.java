package view;
import controller.Controller;
import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet
{

	public static void main(String[] args) 
	{
		PApplet.main("view.Main");
	}
	
	@Override
	public void settings() //void Awake
	{
		size(500, 500);
	}
	
	Controller controller;
	
	@Override
	public void setup() //void Start
	{
		controller = new Controller();
	} 
	
	@Override
	public void draw() //void Update
	{		
		background(255);
		
		textAlign(CENTER);
		rectMode(CENTER);

		controller.paint();
	}
	
	public void mousePressed()
	{
		controller.stopMove(mouseX, mouseY);
		if(mouseButton == RIGHT)
			{
				controller.newFig(mouseX, mouseY);
			}
	}

}
