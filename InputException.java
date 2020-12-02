package Exceptions2;
import java.util.*;
public class InputException {
	public static void main(String []args)
	{
		try
		{
			Exceptions2 e=new Exceptions2();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the integer input: ");
			int input=sc.nextInt();
			System.out.println("Entered value is: "+input);
		}
		catch(InputMismatchException ie)
		{
			System.out.println(ie);
		}
	}
}
