//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;
   private int xPos;
   private int yPos;
   private int width;
   private int height;

	private Color color;
   public Paddle()
   {
	 
		super(10, 10, 10, 10, Color.black);
		speed =5;
      
   }

   public Paddle(int x, int y, int width, int height, Color color, int a)
   {
	    xPos = x;
		yPos = y;
		this.width = width;
		this.height = height;
		this.color = color;
   }
   //add the other Paddle constructors










   public void moveUpAndDraw(Graphics window)
   {


   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   //add get methods
   
   public int getX()
   {
	   return xPos;
   }
   
   public int getY()
   {
	   return yPos;
   }
   
   //add a toString() method
   
   public String toString()
   {
	  return "" + xPos + " "+yPos+" "+width+" "+height+" "+ color;
   }
}