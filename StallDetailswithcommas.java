package stalls;
import java.util.*;
public class StallDetailswithcommas {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Stall Type: ");
		System.out.println("1.Golden stall");
		System.out.println("2.premium stall");
		System.out.println("3.Executive stall");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				System.out.println("Enter Stall details in comma" + "separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
				Scanner sc1=new Scanner(System.in);
				String details = sc1.nextLine();
				String golSplit[] = details.split(",");
				GoldStall g= new GoldStall();
				g.display(golSplit[0],Integer.parseInt(golSplit[1]),golSplit[2],Integer.parseInt(golSplit[3]));
				break;
		case 2 :
				System.out.println("Enter Stall details in comma"+"separated(Stall Name,Stall cost,owner Name,Number of Projectors");
				Scanner sc2=new Scanner(System.in);
				String details1=sc2.nextLine();
				String preSplit[]=details1.split(",");
				PremiumStall p=new PremiumStall();
				p.display(preSplit[0],Integer.parseInt(preSplit[1]),preSplit[2],Integer.parseInt(preSplit[3]));
				break;
		case 3:
				System.out.println("Enter Stall details in comma"+"separated(Stall Name,Cost,Owner Name,Number of Screens");
				Scanner sc3=new Scanner(System.in);
				String details2=sc3.nextLine();
				String exeSplit[]=details2.split(",");
				ExecutiveStall e = new ExecutiveStall();
				e.display(exeSplit[0], Integer.parseInt(exeSplit[1]),exeSplit[2],Integer.parseInt(exeSplit[3]));
				break;
		}
		
	}
}
