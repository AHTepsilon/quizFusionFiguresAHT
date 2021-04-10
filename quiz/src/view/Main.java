package view;
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
	
	String[] archiveText;
	
	@Override
	public void setup() //void Start
	{
		archiveText = loadStrings("archive.txt");
		
		for(int i = 0; i < archiveText.length; i++)
		{
			String[] valuesTXT = archiveText[i].split(" ");
			for(int j = 0; j < valuesTXT.length; j++)
			{
				
			}
		}
	} 
	
	@Override
	public void draw() //void Update
	{		
		background(255);
	}

}
