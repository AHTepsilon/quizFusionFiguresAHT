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
	
	@Override
	public void setup() //void Start
	{
		logicFunctions = new Logic(this);
	} 
	
	@Override
	public void draw() //void Update
	{		
		background(255);
		logicFunctions.importText();
	}

}
