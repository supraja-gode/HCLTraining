package Collections13;
import java.util.*;
public class CollectionsListoflists {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer> > dayList =  new ArrayList<ArrayList<Integer> >();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of booked tickets\n");
		for(int j=0;j<5;j++) {
			ArrayList<Integer> showList = new ArrayList<Integer>();
			showList.add(100);showList.add(100);showList.add(100);showList.add(100);
			System.out.println("On Day "+(j+1));
			String[] booked_ticket = sc.nextLine().split(",");
			ArrayList<Integer> al = new ArrayList<Integer>();
			int[] booked_ticket2 = new int[4];
			for(int k=0;k<booked_ticket.length;k++) {
				al.add(k,Integer.valueOf(booked_ticket[k]));
			}
			for(int l=0;l<4;l++) {
				showList.set(l, 100-al.get(l));
			}
			dayList.add(j,showList);
		}
		String s;
		do {
			System.out.println("Enter the day to know the remaining tickets");
			int day = sc.nextInt();
			System.out.println(dayList.get(day-1));
			System.out.println("Do you want to continue?(y/n)");
			s = sc.next();
		}while(s.equalsIgnoreCase("Y"));
		
	}
}
