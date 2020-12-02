package exceptions;
import java.util.*;
public class ArthimeticExceptionss {
	public static void main(String []args)
	{
		try
		{
			Exceptions1 e =new Exceptions1();
			System.out.println("Enter the cost of the item for n days: ");
			Scanner sc=new Scanner(System.in);
			int cost=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the value of n: ");
			int n=sc.nextInt();
			sc.nextLine();
			int num=cost/n;
			System.out.println("Cost per day of the item is: "+num);
		}	
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}
}
