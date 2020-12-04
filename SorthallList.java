package collections9;
import java.util.*;
public class SorthallList {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		List<Sortlist> arr=new ArrayList<>();
		System.out.println("Enter the number of halls: ");
		int n=sc.nextInt();
		sc.nextLine();
		List<Sortlist> st=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of Hall "+(i+1));
			String details[]=sc.nextLine().split(",");
			String name=details[0];
			String contactNumber=details[1];
			Double costperday=Double.valueOf(details[2]);
			String ownerName=details[3];
			Sortlist s=new Sortlist();
			s.setName(name);
			s.setContactNumber(contactNumber);
			s.setCostperday(costperday);
			s.setOwnerName(ownerName);
			st.add(s);
		}
		Collections.sort(st);
		System.out.format("%-15s %-20s %-15s %s\n","name","Contact number","cost per day","ownerName");
		for(Sortlist list : st) {
			System.out.format("%-15s%-15s%-15s%-15s\n",list.getName(),list.getContactNumber(),list.getCostperday(),list.getOwnerName());
		}
	}
}
