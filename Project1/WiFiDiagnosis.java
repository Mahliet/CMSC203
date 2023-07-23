/*
* Class: CMSC203
* Instructor:Ahmed Tarek
* Description:Build an application that will step through some possible problems to restore internet 
connectivity. Assume that your computer uses wi-fi to connect to a router which 
connects to an Internet Service Provider (ISP) which connects to the Internet.
* Due: 02/08/2022
* Platform/compiler:
* I pledge that I have completed the programming assignment
independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: __Mahliet Admasu________
*/

import java.util.Scanner;
public class WiFiDiagnosis {

	public static void main(String[] args) 
	{
		String response;
		Scanner scan=new Scanner(System.in);
		//First step: reboot your computer
		System.out.println("reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		response=scan.next();
		if(response.equals("no"))
		{
			//Second step: reboot your router
			System.out.println("reboot your router");
			System.out.println("Are you able to connect with the internet? (yes or no)");
			response=scan.next();
			if(response.equals("no"))
			{
				//Third step: make sure the cables to your router are plugged in firmly
				//and your router is getting power
				System.out.println("make sure the cables to your router are plugged in firmly and your router is getting power");
				System.out.println("Are you able to connect with the internet? (yes or no)");
				response=scan.next();
				if(response.equals("no"))
				{
					//Fourth step: move your computer closer to your router
					System.out.println("move your computer closer to your router");
					System.out.println("Are you able to connect with the internet? (yes or no)");
					response=scan.next();
					if(response.equals("no"))
					{
						//Fifth step: contact your ISP
						System.out.println("Contact your ISP");
					}
					else 
					{
						System.out.println("That seemed to be fixing the problem!");
						System.exit(0);
					}
					
				}
				else 
				{
					System.out.println("That seemed to be fixing the problem!");
					System.exit(0);
				}
			}
			else 
			{
				System.out.println("That seemed to be fixing the problem!");
				System.exit(0);
			}
		}
		else 
		{
			System.out.println("That seemed to be fixing the problem!");
			System.exit(0);
		}
		System.out.println("Programmer: Mahliet Admasu");
		System.exit(0);

	}

}
