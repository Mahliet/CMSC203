import javafx.scene.layout.Region;

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

public class ManagementCompany  

{ 
	private int MAX_PROPERTY = 5;

	private double mgmFee;

	private String name;

	private Property[] properties=new Property[MAX_PROPERTY];

	private String taxID;
	
	int index=0;

	/**
	 * constructor
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 */
	public ManagementCompany(String name, String taxID, int mgmFee) 
	{

		this.name=name;

		this.taxID=taxID;

		this.mgmFee=mgmFee;

	}
	/**
	 * 
	 * @param p
	 * @return 
	 */
	public int addProperty(Property p)
	{
		if(index>=MAX_PROPERTY)
		{
			return -1;
		}
		else
		{
			properties[index]=p;

			index++;

			return index-1;
		}
	}
	/**
	 * 
	 * @param index
	 * @return output
	 */
	public String displayPropertyAtIndex(int index)
	{
		String output=properties[index].toString();

		return output;
	}
	/**
	 * getter method
	 * @return
	 */
	public int getMAX_PROPERTY() 
	{
		return MAX_PROPERTY;
	}
	/**
	 * 
	 * @return maximum rent index
	 */
	public int maxPropertyRentIndex()
	{
		double maxRent=0;

		int maxRentIndex=0;
		
		for(int i=0;i<properties.length;i++)
		{
			if(maxRent<properties[i].getRentAmount())
			{
				maxRent=properties[i].getRentAmount();

				maxRentIndex=i;
			}
		}
		
		return maxRentIndex;
	}
	/**
	 * 
	 * @return total rent
	 */
	public double totalRent() 
	{
		double totalRent = 0;
		
		for(int i=0;i<properties.length;i++)
		{
			totalRent+=properties[i].getRentAmount();
		}
		return totalRent;
	}
	/**
	 * return output and management fee
	 */
	public String toString()
	{
		String output="";
		
		for(int i=0;i<properties.length;i++)
		{
			output+=properties[i].toString();
		}
		return (output+"management Fee:"+this.mgmFee);
	}
	public String maxRentProp() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}		