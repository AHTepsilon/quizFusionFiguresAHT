package view;
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
	
	Logic logicFunctions;
	
	int randomNum;
	
	@Override
	public void setup() //void Start
	{
		logicFunctions = new Logic(this);
	} 
	
	@Override
	public void draw() //void Update
	{		
		background(255);
		
		rectMode(CENTER);
		
		logicFunctions.importText();
	}
	
	public void mousePressed()
	{
		if(mouseButton == RIGHT)
		{
			randomNum = (int)random(0, 1);
			
			if(randomNum == 0)
			{
				for(int i = 0; i < logicFunctions.getSquares().size(); i++)
				{
					System.out.println("it one");
				}
			}
			else if(randomNum == 1)
			{
				for(int i = 0; i < logicFunctions.getCircles().size(); i++)
				{
					System.out.println("it two");
				}
			}
		}
	}

}
