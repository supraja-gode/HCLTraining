package collections12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class SearchDetails {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user details");
		int n=sc.nextInt();
		sc.nextLine();
		List<SearchUser> users=new ArrayList<>();
		readData(sc,n,users);
		System.out.println("Search by\n1. Name\n2. Email");
		int choice=sc.nextInt();
		sc.nextLine();
		if(choice==1)
		{
			searchByName(sc, users);
		}
		else if(choice==2)
		{
			searchByEmail(sc,users);
		}
		else
		{
			System.out.println("Invalid");
		}
		sc.close();
	}
	private static void searchByEmail(Scanner sc,List<SearchUser> users)
	{
		System.out.println("Enter Email");
		SearchUser su=new SearchUser();
		su.setEmail(sc.nextLine());
		int index=Collections.binarySearch(users,su,new EmailComparator());
		if(index>=0)
		{
			System.out.printf("%-15s %-15s %-15s %s\n", "Name", "Email", "Username", "Password");
			System.out.println(users.get(index));
		}
		else
		{
			System.out.println("Email not found");
		}
	}
	private static void searchByName(Scanner sc,List<SearchUser> users)
	{
		System.out.println("Enter the name");
		String name=sc.nextLine();
		SearchUser su=new SearchUser();
		su.setName(name);
		int index=Collections.binarySearch(users, su);
		if(index>=0)
		{
			System.out.printf("%-15s %-15s %-15s %s\n", "Name", "Email", "Username", "Password");
			System.out.println(users.get(index));
		}
		else
		{
			System.out.println("Search name not found");
		}
	}
	private static void readData(Scanner sc,int n,List<SearchUser> users)
	{
		for(byte i=1;i<=n;i++)
		{
			System.out.println("Enter the user" +i+"details");
			String s[]=sc.nextLine().split(",");
			users.add(new SearchUser(s[0],s[1],s[2],s[3]));
		}
	}
}
