package hcl;

public class SavingsAccount extends Account{
	protected Double minBalance;
	SavingsAccount(String accnum,Double bal,String accholdname,Double min )
	{
		super(accnum,bal,accholdname);
		this.minBalance = min;
	}
	public Double getMinBalance() 
	{
		return minBalance;
	}

	public void setMinBalance(Double minBalance)
	{
		this.minBalance = minBalance;
	}
}
