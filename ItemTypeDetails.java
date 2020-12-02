package org.hcl;
import java.util.*;
import java.lang.*;
public class ItemTypeDetails
{
	public static void main(String[] args) {
		String c="Y";
		String name1= "";
		double deposit1=0.0;
		double CostPerDay = 0.0;
		Scanner sc=new Scanner(System.in);
		ArrayList<ItemType> arr=new ArrayList<ItemType>();
		do{

			System.out.println("Enter name");
			name1=sc.next();
			System.out.println("Enter Deposit");
			deposit1=sc.nextDouble();
			System.out.println("Enter Costperday");
			CostPerDay=sc.nextDouble();
			System.out.println("Do you want to continue[Y/N]");
			c=sc.next();
			ItemType it=new ItemType();
			it.setName(name1);
			it.setDeposit(deposit1);
			it.setCostPerDay(CostPerDay);
			arr.add(it);
		} while(c.equalsIgnoreCase("Y"));
		ItemTypeDetails obj=new ItemTypeDetails();
		obj.display(arr);
	}
	public void display(ArrayList<ItemType> arr)
	{
		Iterator<ItemType> itr=arr.iterator();
		while(itr.hasNext())
		{
			ItemType it=itr.next();
			System.out.format("%-20s%-20s%-20s\n", it.getName(),it.getDeposit(),it.getCostPerDay());
			//System.out.println(it.getName()+" "+it.getDeposit()+" "+it.getCostPerDay());
		}
	}
}