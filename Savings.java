package accountdetails;

public class Savings extends Account{

	private String orgName;

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Savings() {
	}
	
	public Savings(String orgName) {
		super();
		this.orgName = orgName;
	}

	public void display(String accName1,String accNo1,String bankName1, String orgName1) {
		super.display(accName1, accNo1, bankName1);
		System.out.println("Organisation Name: "+orgName1);
	}
}
