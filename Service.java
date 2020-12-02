package carservices;

public class Service implements Car {
	
	static int charges = 5000;
	@Override
	public void sum(int carNumber) {
		int sum=0;
		while(carNumber!=0) {
		sum =sum+ carNumber%10;
		carNumber=carNumber/10;
		}
		if(sum%2 == 0) {
			System.out.println("You can come on Tuesday, Thursday or Saturday");
		}
		else {
			System.out.println("You can come on Monday, Wednesday and Friday.");
		}
	}

	@Override
	public void years(double years) {
		if(years >= 5) {
			System.out.println("You are eligible for free washing.");
		}
		else {
			System.out.println("You are not eligible for free washing.");
		}
		
	}

	@Override
	public void brand(String brandName) {
		if(brandName.equalsIgnoreCase("Maruthi")) {
			float serviceCharges =(float)(charges - ((charges*5)/100));
			System.out.println("Your servicing charges are-"+serviceCharges);
		}
		else
		{
			System.out.println("Your servicing charges are-"+charges);
		}
		
	}
	
}
