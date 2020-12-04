package collections10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Stalliterator {
	public static void main(String []args)
	{
		String s1;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of stall details: ");
		n=sc.nextInt();
		sc.nextLine();
		List<Stall> emp=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the stall"+(i+1));
			s1=sc.nextLine();
			String b[]=s1.split(",");
			if(!b[0].contains("test"))
			{
				Stall s = new Stall();
				s.setName(b[0]);
				s.setDetail(b[1]);
				s.setType(b[2]);
				s.setOwnerName(b[3]);
				emp.add(s);
			}
		}
		System.out.format("%-15s %-20s %-15s %s\n","name","detail","type","ownerName");
		Iterator<Stall> it=emp.iterator();
		while(it.hasNext())
		{
			Stall itr = it.next();
			System.out.format("%-15s %-20s %-15s %s" ,itr.getName(),itr.getDetail(),itr.getType(),itr.getOwnerName());
		}
	}
}
