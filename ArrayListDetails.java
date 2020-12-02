package collections.com;
import java.util.*;
import java.lang.*;
public class ArrayListDetails {
	public static void main(String args[])
	{
	String c="Y";
	Scanner sc =new Scanner(System.in);
	ArrayList<String> arr=new ArrayList<String>();
	do
	{
		System.out.println("Enter username: ");
		String str=sc.next();
		arr.add(str);
		System.out.println("Do you want to continue[Y/N]");
		c=sc.next();
	}while(c.equals("Y"));
	ArrayListDetails obj=new ArrayListDetails();
	System.out.println("The names entered are: ");
	obj.display(arr);
	}
	public void display(ArrayList<String> arr)
	{
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			String s=o.toString();
			System.out.println(s);
		}
	}
}
