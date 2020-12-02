package collections6;
import java.util.*;
public class CheckingNulls {
	public static void main(String []s)
	{
		String c="Y";
		String userName1="";
		int count = 0;
		Scanner sc=new Scanner(System.in);
		HashSet<String> hashSet= new HashSet<>();
		do
		{
			System.out.println("Enter the username: ");
			userName1=sc.nextLine();
			System.out.println("Do You want to continue[Y/N]");
			c=sc.nextLine();
			hashSet.add(userName1);
		}while(c.equalsIgnoreCase("Y"));
		for(String value : hashSet) {
			if(!value.isBlank())
			{
				count++;
			}
		}
		System.out.println("Number of Users: "+count);
	}
	
}
	
