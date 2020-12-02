package hcl;

public class FixedAccount extends SavingsAccount{
	private Integer lockingPeriod;
	FixedAccount(String accnum,Double bal,String accholdname,Double min,Integer lockingPeriod)
	{
		super(accnum,bal,accholdname,min );
		this.lockingPeriod = lockingPeriod;
	}
	public Integer getLockingPeriod() 
	{
		return lockingPeriod;
	}
	public void setLockingPeriod(Integer lockingPeriod) 
	{
		this.lockingPeriod = lockingPeriod;
	}  
}
