package hcl;

public class Account {
	protected String accountNumber;
	protected Double balance;
	protected String accHoldername;
Account(String accnum,Double bal,String accholdname)
{
	this.accountNumber = accnum;
	this.accHoldername = accholdname;
	this.balance = bal;
}
public String getAccountNumber() 
{
	return accountNumber;
}
public void setAccountNumber(String accountNumber)
{
	this.accountNumber = accountNumber;
}
public Double getBalance()
{
	return balance;
}
public void setBalance(Double balance)
{
	this.balance = balance;
}
public String getAccHoldername() 
{
	return accHoldername;
}
public void setAccHoldername(String accHoldername) 
{
	this.accHoldername = accHoldername;
}
}
