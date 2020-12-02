package accountdetails;

public class Current extends Account{

	private String tinNumber;

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public Current() {
	}

	public Current(String tinNumber) {
		super();
		this.tinNumber = tinNumber;
	}
	
	public void display(String accName1,String accNo1,String bankName1, String tinNo1) {
		super.display(accName1, accNo1, bankName1);
		System.out.println("TIN Number: "+tinNo1);
	}
}
