package createaccount;

public class CreateAccount extends Account{
	private String tinNumber;

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public CreateAccount() {
	}

	public CreateAccount(String tinNumber) {
		super();
		this.tinNumber = tinNumber;
	}
	
	public void display(String tinNumber1,String accName1,String accNo1,String bankName1) {
		super.display(accName1, accNo1, bankName1);
		System.out.println("tinNumber: "+tinNumber1);
	}
}
