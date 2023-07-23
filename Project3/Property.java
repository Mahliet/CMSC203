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

public class Property 
{
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot p;
	/**
	 * 
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	public Property (String propertyName, String city, double rentAmount, String owner) 
	{
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0.0;
	}
	/**
	 * 
	 * @param p
	 */
	public Property (Property p)
	{
		propertyName = p.propertyName;
		city = p.city;
		rentAmount = p.rentAmount;
		owner = p.owner;
	}
	/**
	 * constructor
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Property(String propertyName, String city, double rentAmount,String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	/**
	 * 
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	/**
	 * 
	 * @return property name
	 */
	public String getPropertyName()
	{
		return propertyName;
	}
	/**
	 * 
	 * @return city
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * 
	 * @return rent amount
	 */
	public double getRentAmount()
	{
		return rentAmount;
	}
	/**
	 * 
	 * @param rentAmount
	 */
	public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}
	/**
	 * 
	 * @return owner
	 */
	public String getOwner()
	{
		return owner;
	}
	/**
	 * 
	 * @param owner
	 */
	public void setOwner(String owner)
	{
		this.owner=owner;
	}
	/**
	 * return a string
	 */
	public String toString()
	{
		return "Property Name: "+this.propertyName+"\n"+ "Located: "+this.city+"\n"+ "Belonging to: "+this.owner+"\n"+"Rent Amount: "+this.rentAmount;
	}
	public Plot getPlot() {
		
		return p;
	}
	public void setPlot(Plot p)
	{
		this.p=p;
	}
}


