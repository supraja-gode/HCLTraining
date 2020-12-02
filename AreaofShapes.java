package shapes;
import java.util.*;
public class AreaofShapes {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Shape sh=new Shape();
		System.out.println("Enter the shape");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Triangle");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the Radius: ");
			Scanner sc1=new Scanner(System.in);
			double radius=sc1.nextDouble();
			Circle c=new Circle();
			c.computeArea(radius);
			break;
		case 2:
			System.out.println("Enter the length and breadth: ");
			Scanner sc2=new Scanner(System.in);
			double length=sc2.nextDouble();
			double breadth=sc2.nextDouble();
			Rectangle r=new Rectangle();
			r.computeArea(length,breadth);
			break;
		case 3:
			System.out.println("Enter the base and height: ");
			Scanner sc3=new Scanner(System.in);
			double base=sc3.nextDouble();
			double height=sc3.nextDouble();
			Triangle t=new Triangle();
			t.computeArea(base,height);
			break;
		default :
			System.out.println("Invalid Option");
		}
	}
}
