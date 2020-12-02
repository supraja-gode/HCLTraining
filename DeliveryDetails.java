package deliverydetails;
import java.util.*;
class DeliveryDetails
{
	public static void main(String[] args)
	{
		Long over;
		Long ball;
		Long runs;
		String batsman;
		String bowler;
		String nonstriker;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the over: ");
	over=sc.nextLong();
	sc.nextLine();
	System.out.println("Enter the ball: ");
	ball=sc.nextLong();
	sc.nextLine();
	System.out.println("Enter the runs: ");
	runs=sc.nextLong();
	sc.nextLine();
	System.out.println("Enter the batsman name: ");
	batsman=sc.nextLine();
	System.out.println("Enter the bowler name: ");
	bowler=sc.nextLine();
	System.out.println("Enter the nonstriker name: ");
	nonstriker=sc.nextLine();
	System.out.println("Delivery details: ");
	System.out.println("Over: "+over);
	System.out.println("Ball: "+ball);
	System.out.println("Runs: "+runs);
	System.out.println("Batsman: "+batsman);
	System.out.println("Nonstriker: "+nonstriker);
}
}