package collections11;
import java.util.*;
public class UserDetailsTest {
	public static void main(String []s)
	{
		Scanner sc=new Scanner(System.in);
		List<UserDetails> ud=new ArrayList<UserDetails>();
		System.out.println("Enter the number of Users: ");
		int n=sc.nextInt();
		sc.nextLine();
		List<UserDetails> uds=new ArrayList<UserDetails>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the User "+(i+1)+" Details");
			String details[]=sc.nextLine().split(",");
			UserDetails us=new UserDetails();
			us.setName(details[0]);
			us.setMobileNumber(details[1]);
			us.setUserName(details[2]);
			us.setPassword(details[3]);
			uds.add(us);
		}
		Collections.sort(uds);
		//System.out.println("Sorted user details");
		for(UserDetails list: uds)
		{
			//System.out.format("%-15s%-15s%-15s%-15s\n",list.getName(),list.getMobileNumber(),list.getUserName(),list.getPassword());
		}
		Collections.sort(uds,Collections.reverseOrder());
		System.out.println("The user Details in reverse order");
		System.out.println("Name"+"\t"+"Mobile Number");
		for(UserDetails list2: uds)
		{
			System.out.format("%-15s%-15s\n",list2.getName(),list2.getMobileNumber());
		}
	}
}
