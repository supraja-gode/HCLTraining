package venuedetails;
import java.util.*;
public class UpdateVenueDetails {
	public static void main(String []args) 
	{
		String name;
		String city;
		String name1;
		String city1;
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter venue name: ");
		name=sc.nextLine();
		System.out.println("enter city name: ");
		city=sc.nextLine();
		VenueDetails sa=new VenueDetails();
		sa.setName(name);
		sa.setName(city);
		do
		{
			System.out.println("Venue details: ");
			System.out.println("venue name:"+name);
			System.out.println("city name:"+city);
			System.out.println("verify and update venue details");
			System.out.println("menu");
			System.out.println("1.update the venue details");
			System.out.println("2.update the city details");
			System.out.println("3.All Information correct or Exit");
			System.out.println("type 1 or type 2 or type 3");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				System.out.println("enter venue name");
				name1=sc.nextLine();
			        name=name1.replaceAll(name1,name);
				break;
			case 2:
				System.out.println("enter city name");
				city1=sc.nextLine();
				city=city1.replaceAll(city1,city);
				break;
			case 3:
				System.out.println("venue name: "+name);
				System.out.println("city name: "+city);
				break;
                       

			}
		}while(choice!=3);
	}
}
