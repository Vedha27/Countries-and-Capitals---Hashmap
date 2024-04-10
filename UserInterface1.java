package HashmapCountriesandCapitals;
import java.util.*;


public class UserInterface1 {

	public static void main(String args[])
	{
		Scanner y=new Scanner(System.in);
		
		int c;
		String cName;
		String capName;
		Country o=new Country();
		
		do
		{
			System.out.println("1. Add");
			System.out.println("2. Search");
			System.out.println("3. Exit");
			System.out.print("Enter your choice:");
			c=y.nextInt();
			
			switch(c)
			
			{
				case 1:
					System.out.print("Enter the country name:");
				
					cName=y.next();
					System.out.print("Enter capital name:");
					capName=y.next();
					o.add(cName, capName);
					break;
				case 2:
					if(o.getCountryMap().isEmpty())
					{
						System.out.println("The map is empty");
						
					}
					else
					{
						System.out.print("Enter the country name:");
					
						cName=y.next();
						String ans=o.search(cName);
						if(ans==null) 
						{
							System.out.println("Data not found");
							
						}
						else
						{
							System.out.println(ans);
						}
						break;
					}
						
					case 3:
							
							System.out.println("Thank you for usinig the application");
							break;
							
						
					}
			}while(c>0&&c<3);
			
		}
		
	}

