/**
 * Class: CMSC203 35533
 *  Program: Assignment 4
 *  Instructor: Ahmed Tarek
 * Description: Write an application that lets the user create a management company and add the properties managed by the company to its list. Assume the maximum number of properties handled by the company is 5.  
 * Due: 03/29/2022
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Mahliet Admasu
*/

public class Plot 
{
	 private int x;
     private int y;
     private int width;
     private int depth;
     /**
      * constructor
      */
     public Plot()
     {
    	 x=0;
         y=0;
         width=0;
         depth=0;
     }
     /**
      * 
      * @param x
      * @param y
      * @param depth
      * @param width
      */
     public Plot(int x, int y,int depth, int width)
     {
    	 this.x = x;
         this.y = y;
         this.depth = depth;
         this.width = width;
     }
     /**
      * 
      * @param p
      */
     public Plot(Plot p)
     {
    	 x = p.x;
         y = p.y;
         depth = p.depth;
         width = p.width;
     }
     /**
      * 
      * @param x
      */
     public void setX(int x)
     {
    	 this.x = x;
     }
     /**
      *  
      * @param y
      */
     public void setY(int y)
     {
         this.y = y;
     }
     /**
      * 
      * @return x
      */
     public int getX() 
     {
		return x;
	 }
     /**
      * 
      * @return y
      */
	public int getY() 
	{
		return y;
	}
	/**
	 * 
	 * @return width
	 */
	public int getWidth() 
	{
		return width;
	}
	/**
	 * 
	 * @return depth
	 */
	public int getDepth() 
	{
		return depth;
	}
	/**
      * 
      * @param depth
      */
     public void setDepth(int depth)
     {
         this.depth = depth;
     }
     /**
      * 
      * @param width
      */
     public void setWidth(int width)
     {
         this.width = width;
     }
     /**
      * 
      * @param plot
      * @return 
      */
     public boolean overlaps(Plot p)
     {
    	 if(((x>=p.x && x <= (p.x+p.width)) && (y >=p.y && y <= (p.y+p.depth))) || ((x>=p.x && x <= (p.x+p.width)) && ((y +depth) >=p.y && (y+depth) <= (p.y+p.depth))) ||
    			 (((x + width)>=p.x && (x+width) <= (p.x+p.width)) && (y >=p.y && y <= (p.y+p.depth))) ||(((x+width)>=p.x && (x+width) <= (p.x+p.width)) && ((y+depth) >=p.y && (y+depth) <= (p.y+p.depth))))
    	 {
    		 return true;
    	 }
         else if(((p.x>=x && p.x <= (x+width)) && (p.y >=y && p.y <= (y+depth))) || (((p.x + p.width)>=x && (p.x+p.width) <= (x+width)) && (p.y >= y && p.y <= (y+depth))) ||

                  ((p.x>=x && p.x <= (x+width)) && ((p.y +p.depth) >= y && (p.y+p.depth) <= (y+depth))) ||(((p.x+p.width)>=x && (p.x+p.width) <= (x+width)) && ((p.y+p.depth) >= y && (p.y+p.depth) <= (y+depth))))
         {
          	 return true;
         }
         return false;
     }
     /**
      * 
      * @param p
      * @return
      */
     public boolean encompasses(Plot p)
     {
    	 if(((p.x>= x && p.x <= (x+width)) && (p.y >= y && p.y <= (y+depth))) && (((p.x + p.width)>= x && (p.x+p.width) <= (x+width)) && (p.y >= y && p.y <= ( y+depth))) ) 
    	 {
    		 return true; 
    	 }
    	 return false;
     }
}