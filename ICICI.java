package mutualfunds;
import java.util.*;
public class ICICI implements MutualFund {
	Scanner sc = new Scanner(System.in);
    static int amt;
    static int dur;
    public void amount() {
        System.out.println("Enter the amount you want to invest");
        amt = sc.nextInt();
    }
    public void duration() {
        System.out.println("Enter the duration to invest");
        dur = sc.nextInt();
    }
}
