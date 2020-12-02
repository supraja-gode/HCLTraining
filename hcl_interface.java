package mutualfunds;
import java.util.*;
public class hcl_interface {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Select the mutual fund u want to choose\n1.Axis Bank\n2.ICICI Bank\n3.HDFC\t");
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.nextLine());    
        switch(s) {
        case 1:
            MutualFund mf = new AxisBank();
            mf.amount();mf.duration();
            int d = (int)(AxisBank.amt*AxisBank.dur*MutualFund.axis_int);
            System.out.print("The Returns in Axis bank is "+ d);
            break;
        case 2:
            MutualFund mf2 = new ICICI();
            mf2.amount();mf2.duration();
            int d1 = (int)(ICICI.amt*ICICI.dur*MutualFund.icici_int);
            System.out.print("The Returns in ICICI bank is "+ d1);
            break;
        case 3:
            MutualFund mf3 = new HDFC();
            mf3.amount();mf3.duration();
            int d2 = (int)(HDFC.amt*HDFC.dur*MutualFund.hdfc_int);
            System.out.print("The Returns in HDFC is "+ d2);
            break;
                
        }
        
    }
}
