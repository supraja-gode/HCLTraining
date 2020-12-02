package exceptions;
import java.util.*;
public class NumberForamtExceptions {
	public static void main(String []args)
	{
		String name;
		try
		{
			
			String deposit;
			String cost;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Item type details: ");
			System.out.println("Enter the name: ");
			name=sc.nextLine();
			System.out.println("Enter the deposit: ");
			deposit=sc.nextLine();
			Integer I=Integer.valueOf(deposit);
			System.out.println("Enter the cost per day: ");
			cost=sc.nextLine();
			Integer I1=Integer.valueOf(cost);
			System.out.println("Enter the details of the item type: ");
			System.out.println("Name: "+name);
			System.out.println("Deposit: "+I);
			System.out.println("Cost per Day: "+I1);
		}
		catch(NumberFormatException ne)
		{
			System.out.println(ne);
		}
}
}