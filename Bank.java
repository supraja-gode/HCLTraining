package createaccount;
import java.util.*;
public class Bank {
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Accountname:");
		String accName=sc.nextLine();
		System.out.println("Enter the Bank number");
		String accNo=sc.nextLine();
		System.out.println("Enter the Bank Name:");
		String bankName=sc.nextLine();
		System.out.println("Enter the TinNumber:");
		String tinNumber=sc.nextLine();
		CreateAccount acc = new CreateAccount();
		acc.display(accName, accNo, bankName, tinNumber);
	}
}
