
public class Customer 
{
	private String name;
    private int age;
    
    
    public Customer(String nam, int ag) 
    {
            name = nam;
            age = ag;
    }
    
    public Customer(Customer cust) 
    {
            name = cust.getName();
            age = cust.getAge();
    }
    
    public String toString() 
    {
            return name +", " +age ;
    }
    
    public String getName() 
    {
            return name;
    }
    
    public int getAge() 
    {
            return age;
    }
    
    public void setName(String nam) 
    {
            name = nam;
    }
    
    public void setAge(int ag) 
    {
            age = ag;
    }
}

