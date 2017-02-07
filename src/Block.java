//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}
public Block(int x, int y, int width, int height, Color color)
{
	xPos = x;
	yPos = y;
	this.width = width;
	this.height = height;
	this.color = color;
}
	//add other Block constructors - x , y , width, height, color
	
	
	
	
	
	
	
	   public int getWidth() 
	   {
	
		   	return width;
	   }
	public int getHeight()
	{
		return height;
	}
	
   //add the other set methods
   

   public void setColor(Color col)
   {


   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }


public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{




		return false;
	}

	
	public void setPos(int x, int y) {
		
		
	}

	
	public void setX(int x) 
	{
		xPos = x;
	}


	public void setY(int y) {
				
	}

	
	public int getX() {
				return xPos;
	}

	
	public int getY() {
		return yPos;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		return "" + xPos + " "+yPos+" "+width+" "+height+" "+ color;
	}
}