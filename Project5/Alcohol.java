
/**
 * @author mahlet
 *
 */

public class Alcohol extends Beverage 

{ 

	private boolean isWeekend; 

	private final double WEEKEND_COST=0.6; 

	 

	public Alcohol(String name, SIZE size, boolean isWeekend) 

	{ 

		super(name,TYPE.ALCOHOL, size); 

		this.isWeekend=isWeekend; 

	} 


	/**
	 * This method prints abbreviation for
	 * my country The United States of America
	 * @param us The String abbreviation supplied
	 * @return returns complete abbreviation for my country the USA
	 */
	public String toString() 

	{ 

		  String n;  

		  n = getName() +", " +getSize(); 

           

          if (isWeekend) 

          { 

                  n += " Weekend"; 

          } 

           

          n += ", $" + calcPrice(); 

           

          return n; 

	} 

  
/**
 * return price
*
*/
	public double calcPrice()  

	{ 

	    double price = super.getBasePrice(); 

         

        if (super.getSize() == SIZE.MEDIUM)  

        { 

                price += super.getSizePrice(); 

        } 

        else if (super.getSize() == SIZE.LARGE)  

        { 

                price += 2 * super.getSizePrice(); 

        } 

         

        if (isWeekend) { 

                price += WEEKEND_COST; 

        } 

         

        return price;  

	} 

	/**
	 * return boolean
	 */

	public boolean equals (Alcohol alco) 

	{ 

		if (super.equals(alco) && isWeekend == alco.getIsWeekend())  

		 { 

             return true; 

		 } 

		else  

     	{ 

             return false; 

     	} 

	} 

	 

	public boolean getIsWeekend() 

	{ 

		return isWeekend; 

	} 

	 

	public double getWeekendCost() 

	{ 

		return WEEKEND_COST; 

	} 

	 

	public void setIsWeekend(boolean weekend) 

	{ 

		isWeekend= weekend; 

	} 

	 

	 

} 

 