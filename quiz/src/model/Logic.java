package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic
{
	private ArrayList<Square> squares;
	private ArrayList<Circle> circles;
	private ArrayList<Triangle> triangles;
	private ArrayList<String> words;
	
	PApplet app;
	String[] textLines;
	String[] archiveText;
	
	public Logic(PApplet app) 
	{
		this.app = app;
		
		squares = new ArrayList<>();
		circles = new ArrayList<>();
		triangles = new ArrayList<>();
		words = new ArrayList<>();
	}
	
	public void readValuesFromTXT()
	{
		//the text file isn't being loaded correctly
		archiveText = app.loadStrings("data/textData.txt");
		
		for(int i = 0; i < archiveText.length; i++)
		{
			textLines = PApplet.split(archiveText[i], " ");
			
			for (int j = 0; j < textLines.length; j++)
			{
				words.add(textLines[j]);
			}
		}
	}
	
	public void importText()
	{
		
		for(int i = 0; i < archiveText.length; i++)
		{
			if(archiveText[i].contains("IDsquare"))
			{
				int posX = Integer.parseInt(words.get(i + 1));
				int posY = Integer.parseInt(words.get(i + 2));
				int dir = Integer.parseInt(words.get(i + 3));
				int size = Integer.parseInt(words.get(i + 4));
				int num = Integer.parseInt(words.get(i + 5));
				
				Square square = new Square(posX, posY, dir, size, num);
				squares.add(square);
			}
			
			if(archiveText[i].contains("IDcircle"))
			{
				int posX = Integer.parseInt(words.get(i + 1));
				int posY = Integer.parseInt(words.get(i + 2));
				int dir = Integer.parseInt(words.get(i + 3));
				int size = Integer.parseInt(words.get(i + 4));
				int num = Integer.parseInt(words.get(i + 5));
				
				Circle circle = new Circle(posX, posY, dir, size, num);
				circles.add(circle);
			}
		}
	}
	
	public void paintSq()
	{
		for(int i = 0; i < squares.size(); i++)
		{
			squares.get(i).paint(app);
			squares.get(i).move(app);
			squares.get(i).bounce();
		}
	}
	
	public void paintCr()
	{
		for(int i = 0; i < circles.size(); i++)
		{
			circles.get(i).paint(app);
			circles.get(i).move(app);
			circles.get(i).bounce();
		}
	}
	
	public void paintTr()
	{
		for(int i = 0; i < triangles.size(); i++)
		{
			triangles.get(i).paint(app);
			triangles.get(i).move(app);
			triangles.get(i).bounce();
		}
	}
	
	public ArrayList<Square> getSquares() {
		return squares;
	}

	public void setSquares(ArrayList<Square> squares) {
		this.squares = squares;
	}

	public ArrayList<Circle> getCircles() {
		return circles;
	}

	public void setCircles(ArrayList<Circle> circles) {
		this.circles = circles;
	}

	public ArrayList<Triangle> getTriangles() {
		return triangles;
	}

	public void setTriangles(ArrayList<Triangle> triangles) {
		this.triangles = triangles;
	}

}
