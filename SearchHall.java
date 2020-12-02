package collections3;
import java.util.*;
public class SearchHall {
	public static void main(String []args)
	{
		int halls;
		String hallName;
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		System.out.println("Enter the number of halls: ");
		halls=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<halls;i++)
		{
			System.out.println("Enter the Hall Name "+(i+1));
			hallName=sc.nextLine();
			arr.add(hallName);
		}
		System.out.println("Enter hall name to be searched:");
		String hallName1 = sc.nextLine();
		if(arr.contains(hallName1)) {
			System.out.println(hallName1 +"is found in position" + arr.indexOf(hallName1));
		}
	}
}
