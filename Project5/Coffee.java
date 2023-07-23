
public class Coffee extends Beverage 
{
	private static final String String = null;
	private boolean extraShot;
	private boolean extraSyrup;
	private final double COFFEE_SHOT=0.5;
	private final double SYRUP_SHOT=0.5;
	
	
	public Coffee(String name, SIZE size,boolean extraShot, boolean extraSyrup) 
	{
		super(name,TYPE.COFFEE, size);
		this.extraShot=extraShot;
		this.extraSyrup=extraSyrup;	
	}
	
    @Override
	public String toString()
	{
		 String shot = getName()+" "+getSize();
		 if (extraShot) 
		 {
              shot += " Extra shot";
		 }
		 if (extraSyrup) 
		 {
              shot += " Extra syrup";
		 }
      
		 shot += calcPrice();
      return shot;
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
        
        if (extraShot)
        {
                price += COFFEE_SHOT;
        }
        if (extraSyrup)
        {
                price += SYRUP_SHOT;
        }
        
        return price;
	}
	
	@Override
	public boolean equals(Coffee coff)
	{
		  if (super.equals(coff) && extraShot==coff.getExtraShot() && extraSyrup==coff.getExtraSyrup())
		  {
			return true;  
		  }
		  else 
		  {
			  return false;
		  }
	}
	
	public boolean getExtraShot()
	{
		return extraShot;
	}
	
	public boolean getExtraSyrup()
	{
		return extraSyrup;
	}
	
	public double getCoffeShot()
	{
		return COFFEE_SHOT;
	}
	
	public double getSyrupShot()
	{
		return SYRUP_SHOT;
	}
	
	public void setExtraShot(boolean shot)
	{
		extraShot=shot;
	}
	
	public void setExtraSyrup(boolean syrup)
	{
		extraSyrup=syrup;
	}
	
}
