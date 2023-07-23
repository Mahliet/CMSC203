
public class Smoothie extends Beverage
{
	private int numOf;
	private boolean powder;
	private final double ADDED_PROT=1.5;
	private final double ADDED_FRU=0.5;
	
	
	public Smoothie(String name, SIZE size,int numOf, boolean powder) 
	{
		super(name,TYPE.SMOOTHIE, size);
		this.numOf=numOf;
		this.powder=powder;
	}
	
	@Override
	public String toString()
	{
		String n = getName() +", " +getSize() +" " +numOf;
        
        if (powder) 
        {
                n += " Protein powder";
        }
        
        n += calcPrice();
        
        return n;
	}

	@Override
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
        
        price += numOf * ADDED_FRU;
        if (powder) 
        {
                price += ADDED_PROT;
        }
        
        return price;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean equals(Smoothie smo)
	{
		if(super.equals(smo)&&powder==smo.getPowder()&&numOf==smo.getNumOf())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getNumOf() 
	{
          return numOf;
	}
	
	public boolean getPowder() 
	{
          return powder;
	}
	
	public double getAddedFru() 
	{
          return ADDED_FRU;
	}
	
	public double getAddedProt() 
	{
          return ADDED_PROT;
	}
  
	public void setNumOfFruits(int num) 
	{
          numOf = num;
	}
	public void setPowder(boolean pow) 
	{
          powder = pow;
	}
}
	


