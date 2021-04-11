package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic
{
	private ArrayList<Square> squares;
	private ArrayList<Circle> circles;
	private ArrayList<Triangle> triangles;
	
	PApplet app;
	String[] archiveText;
	
	public Logic(PApplet app) 
	{
		this.app = app;
		
		squares = new ArrayList<>();
		circles = new ArrayList<>();
		triangles = new ArrayList<>();
		
		archiveText = app.loadStrings("C:\\Users\\AHT\\Desktop\\Universidad\\Program\\Workspace\\quiz\\data\\archive");
		
	}
	
	public void importText()
	{
		for(int i = 0; i < archiveText.length; i++)
		{
			if(archiveText[i].contains("IDsquare"))
			{
				squares.add(new Square((int)app.random(400), (int)app.random(400), (int)app.random(-2, 2), 
						(int)app.random(-2, 2), (int)app.random(255), (int)app.random(255), (int)app.random(255), 
						(int)app.random(50, 100), (int)app.random(30)));
				
				System.out.println("square");
				
				squares.get(i).paint(app);
				squares.get(i).move(app);
				squares.get(i).bounce();
			}
			if(archiveText[i].contains("IDcircle"))
			{
				circles.add(new Circle((int)app.random(400), (int)app.random(400), (int)app.random(-2, 2), 
						(int)app.random(-2, 2), (int)app.random(255), (int)app.random(255), (int)app.random(255), 
						(int)app.random(50, 100), (int)app.random(30)));
			
				System.out.println("circle");
				
				circles.get(i).paint(app);
				circles.get(i).move(app);
				circles.get(i).bounce();
			}
		}
	}

}
