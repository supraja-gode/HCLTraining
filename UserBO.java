package collections7;
import java.io.*;
import java.util.*;
public class UserBO extends ArrayList
	{
	String name;
	String contactNumber;
	String userName;
	String email;
	public UserBO(String name,String contactNumber,String userName,String email)
	{
		super();
		this.name=name;
		this.contactNumber=contactNumber;
		this.userName=userName;
		this.email=email;
	}
	public static void display(ArrayList<UserBO> Users1)
	{
		System.out.printf("%-20s %-20s %-20s %-20s%n","Name","Contact Number","UserName","Email");
	for(int j=0;j<Users1.size();j++)
	{
		System.out.printf("%-20s %-20s %-20s %-20s%n",Users1.get(j).name, Users1.get(j).contactNumber, Users1.get(j).userName, Users1.get(j).email);
	}
	}
	public static ArrayList<UserBO> deleteRows(ArrayList<UserBO> Users1,int i1,int i2)
	{
		for (int ic=i1;ic<i2;ic++)
		{
			Users1.remove(ic);
		}
	return Users1;
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<UserBO> Users1 = new ArrayList<UserBO>();
		ArrayList<UserBO> Users2=new ArrayList<UserBO>();
		System.out.println("Enter the number of User details to be added");
		int n=sc.nextInt();
		System.out.println("Enter the user details in csv format");
	for(int i=0;i<n;i++)
	{
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		String str1 = ob.readLine();
		String[] input=str1.split(",",4);
		UserBO Users = new UserBO(input[0],input[1],input[2],input[3]);
		Users1.add(Users);
	}
	display(Users1);
	System.out.println("Enter the starting and ending rows for deletion");
	int i1=sc.nextInt();
	int i2=sc.nextInt();
	Users2=deleteRows(Users1,i1,i2);
	display(Users2);
	Users1.addAll(Users2);
	//display(Users1);
	sc.close();
}
}

