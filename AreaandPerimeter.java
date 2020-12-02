package interface2;
import java.util.*;
public class AreaandPerimeter {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the breadth and length of square");
		double length=sc.nextDouble();
		sc.nextLine();
		double breadth=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the Side Value");
		double side=sc.nextDouble();
		sc.hasNextLine();
		Rectangle r =new Rectangle();
		r.calPeri(length, breadth);
		r.calArea(length, breadth);
		Square s=new Square();
		s.calPeri(side);
		s.calArea(side);
		}
}
