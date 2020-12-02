package carservices;
import java.util.*;
public class CarService {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the car number: ");
		int carNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("How many years old car do you have-");
		double years=sc.nextDouble();
		sc.nextLine();
		System.out.println("Car Brand-");
		String brandName = sc.nextLine();
		Service s =new Service();
		if(years>=5) {
			s.sum(carNumber);
			s.years(years);
		}
		else {
			s.sum(carNumber);
			s.years(years);
			s.brand(brandName);
		}
	}
}
