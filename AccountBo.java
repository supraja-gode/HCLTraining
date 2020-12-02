package hcl;
import java.util.Scanner;
public class AccountBo {
	public FixedAccount getAccountDetails(String detail)
	{
		String[] det = detail.split(",");
		String num = det[0];
		Double bal = Double.parseDouble(det[1]);
		String name = det[2];
		Double minbal = Double.parseDouble(det[3]);
		Integer lock = Integer.parseInt(det[4]);
		FixedAccount f = new FixedAccount(num,bal,name,minbal,lock);
		System.out.println(f.getAccountNumber()+" "+f.getBalance()+ " "+f.getAccHoldername()+" "+f.getMinBalance()+" "+f.getLockingPeriod());
	return f;
	}
}
