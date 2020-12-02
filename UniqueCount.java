package sets;
import java.util.*;
public class UniqueCount {
	public static void main(String []s)
	{
		String c="Y";
		String userName1="";
		Scanner sc=new Scanner(System.in);
		HashSet<String> hashSet = new HashSet<String>();
		do
		{
			System.out.println("Enter username:");
			userName1=sc.nextLine();
			System.out.println("Do you want to continue[Y/N]");
			c=sc.nextLine();
			hashSet.add(userName1);
		}while(c.equalsIgnoreCase("Y"));
		System.out.println("Unique Number of Usernames: "+hashSet.size());
}
}
