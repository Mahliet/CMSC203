import java.util.ArrayList; 
import java.util.Random; 
/**
 * 
 * @author mahle
 *
 */
public class Order implements OrderInterface, Comparable<Order>  
{ 
        private int orderNo; 
        private int orderTime; 
        private DAY orderDay; 
        private Customer cust; 
        private ArrayList<Beverage> beverages; 
        /**
         * constructor
         * @param time
         * @param day
         * @param c
         */
        public Order(int time, DAY day, Customer c) 
        { 
                orderNo = randNum(); 
                orderTime = time; 
                orderDay = day; 
                cust = c; 
                beverages = new ArrayList<>(); 
        } 
        /**
         * 
         * @return the generated random order number
         */
        public int randNum() 
        { 
                Random rand = new Random(); 
                int randInt = rand.nextInt(90_000-10_000)+10_000; 
                return randInt; 
        } 
        /**
         * 
         */
        public String toString() 
        { 
                String str= orderDay.toString() +" " +orderTime +cust.toString() +" Order Num: " +orderNo;                 
                for (Beverage b : beverages)  
                { 
                        str += b.toString(); 
                } 
                str +=  +calcOrderTotal(); 
                return str; 
        } 
        /**
         * determine whether the order day is a weekend
         */
        public boolean isWeekend() 
        { 
                if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY)  
                { 
                        return true; 
                } 
                return false; 
        } 
        /**
         * compareTo method
         */
        public int compareTo(Order o)  
        { 
                if (orderNo == o.getOrderNo()) 
                { 
                        return 0; 
                } 
                else if (orderNo > o.getOrderNo())  
                { 
                        return 1; 
                } 
                else  
                { 
                        return -1; 
                } 
        } 
        /**
         * calculate and return the order total
         */
        public double calcOrderTotal()  
        { 
                double orderTotal = 0; 
                for (Beverage b : beverages)  
                { 
                        orderTotal += b.calcPrice(); 
                } 
                return orderTotal; 
        } 
        /**
         * return the number of the beverage type 
         */
        public int NumOfBeverageType(TYPE type)  
        { 
                int num = 0; 
                for (Beverage b : beverages)  
                { 
                        if (b.getType() == type) 
                        { 
                                num++; 
                        } 
                } 
                return num; 
        }     
        /**
         * 
         * @return the beverage size
         */
        public int getTotalItems()  
        { 
                return beverages.size(); 
        } 
        /**
         * adds beverage
         */
        public void addNewBeverage(String name, SIZE size, boolean extraShot, boolean extraSyrup) 
        { 
                Coffee co = new Coffee(name, size, extraShot, extraSyrup); 
                beverages.add(co); 
        } 
        /**
         * adds beverage
         */
        public void addNewBeverage(String name, SIZE size, int numOfFruits, boolean proteinPowder)  
        { 
                Smoothie smo = new Smoothie(name, size, numOfFruits, proteinPowder); 
                beverages.add(smo); 
        } 
        /**
         * adds beverage
         */
        public void addNewBeverage(String name, SIZE size) 
        { 
                boolean isWeekend = false; 
                if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY)  
                { 
                        isWeekend = true; 
                } 
                Alcohol alco = new Alcohol(name, size, isWeekend); 
                beverages.add(alco); 
        } 
        /**
         * returns beverages' item number
         */
        public Beverage getBeverage(int num) 
        { 
                return  beverages.get(num); 
        } 
        /**
         * 
         * @return order number
         */
        public int getOrderNo() 
        { 
                return orderNo; 
        } 
        /**
         * 
         * @return order time
         */
        public int getOrderTime() 
        { 
                return orderTime; 
        } 
        /**
         * 
         * @return order day
         */
        public DAY getOrderDay()  
        { 
                return orderDay; 
        } 
        /**
         * 
         * @return customer's information
         */
        public Customer getCustomer()  
        { 
                return new Customer(cust); 
        } 
        /**
         * 
         * @return beverages
         */
        public ArrayList<Beverage> getBeverages()  
        { 
                return beverages; 
        } 
        /**
         * 
         * @param num
         */
        public void setOrderNum(int num)  
        { 
                orderNo = num; 
        } 
        /**
         * 
         * @param t
         */
        public void setOrderTime(int t)  
        { 
                orderTime = t; 
        } 
        /**
         * 
         * @param d
         */
        public void setOrderDay(DAY d)  
        { 
                orderDay = d; 
        } 
        /**
         * 
         * @param c
         */
        public void setCustomer(Customer c)  
        { 
                cust = c; 
        }
		@Override
		public int findNumOfBeveType(TYPE type) {
			// TODO Auto-generated method stub
			return 0;
		} 
} 