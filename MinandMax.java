import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class MinandMax {
	public static void main(String []s)
	{
		Scanner sc=new Scanner(System.in);
		List<TicketBooking> arr=new ArrayList<>();
		System.out.println("Enter the number of customers: ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the booking price accordingly in CSV(name,price)");
		for(int i=0;i<n;i++)
		{
			String tickets[]=sc.nextLine().split(",");
			arr.add(new TicketBooking(tickets[0],Integer.parseInt(tickets[1])));
			
		}
		TicketBooking maxTicket=Collections.max(arr,new TicketBooking());
		TicketBooking minTicket=Collections.min(arr,new TicketBooking());
		System.out.println(minTicket.getName()+ " spends minimum amount of "+minTicket.getPrice());
		System.out.println(maxTicket.getName()+" Spends maximum amount of "+maxTicket.getPrice());
		sc.close();
	}
}