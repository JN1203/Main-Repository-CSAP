//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;
	
	public Ball()
	{
		super(200,200, 10, 10, Color.WHITE);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, Color color, int a, int b)
	{
		xPos = x;
		yPos = y;
		this.width = width;
		this.height = height;
		this.color = color;
		//add the other Ball constructors
	}
	
	public void setXSpeed(int x)
	{
		xSpeed = x;
	}
	
	public void setYSpeed(int y)
	{
		ySpeed = y;
	}
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   window.setColor(Color.WHITE);
	   window.drawOval(xPos, yPos, width, height);

      setX(getX()+xSpeed);
	  setY(getY()+ySpeed);

		//draw the ball at its new location
	  window.setColor(color);
	   window.fillOval(xPos, yPos, width, height);
   }
   
   
	public int getXSpeed() 
	{
		return xSpeed;
	}


	public int getYSpeed() 
	{
		return ySpeed;
	}   
   //add the get methods
	public String toString()
	{
		return "" + xPos + " "+yPos+" "+width+" "+height+" "+ color;
	}
   //add a toString() method
}