package venue;
import java.util.*;
class Main
{
public static void main(String[] s)
{
	String name,city;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the venue name: ");
	name=sc.nextLine();
	System.out.println("Enter the city name: ");
	city=sc.nextLine();
	System.out.println("Venue Details: ");
	System.out.println("Venue Name: "+name);
	System.out.println("City Name: "+city);
}
}