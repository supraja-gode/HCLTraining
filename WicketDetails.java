package wicketdetails;
import java.util.*;
public class WicketDetails {
	public static void main(String []args)
	{
	 Long over;
	 Long ball;
	 String wicketType;
	 String playerName;
	 String bowler;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of Wickets");
	
	int wickets=sc.nextInt();
	String[] arr=new String[wickets];
	for(int i=0;i<wickets;i++)
	{
		System.out.println("Enter the details of wicket"+(i+1));
		arr[i]=sc.next();
	}
	for(int i=0;i<wickets;i++)
	{
		String[] details;
		details=arr[i].split(",");
		System.out.println("over:"+details[0]);
		System.out.println("Ball:"+details[1]);
		System.out.println("Wicket type:"+details[2]);
		System.out.println("playername:"+details[3]);
		System.out.println("bowlername:"+details[4]);
	}
	}
	
}
