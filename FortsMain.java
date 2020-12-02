package interfaces;
import java.util.*;
public class FortsMain {

	public static void main(String args[]) {
		System.out.println("What you want to visit:");
		System.out.println("Rajmachi");
		System.out.println("Shivgadh");
		System.out.println("Murud");
		Scanner sc=new Scanner(System.in);
		String fortName = sc.nextLine();
		
		switch(fortName)
		{
		case "Rajmachi" : 
			Rajmachi rajmachi = new Rajmachi();
			rajmachi.distance(fortName);
			break;
		case "Shivgadh" : 
			Shivgadh shivgadh = new Shivgadh();
			shivgadh.distance(fortName);
		 	break;
		case "Murud" : 
			Murud murud = new Murud();
			murud.distance(fortName);
			break;
		default : System.out.println("Invalid input");
		}
	}
}
