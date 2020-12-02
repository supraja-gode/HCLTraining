package collections4;
import java.util.*;
import java.io.*;
class CallLog
{
		String dailedNumber;
		int duration;
		String dailedDate;
}
public class SummaryLog implements Comparable<SummaryLog>
{
		String dailedNumber;
		int totalDuration;
		public String getDailedNumber()
		{
			return dailedNumber;
		}
		public void setDailedNumber(String dailedNumber)
		{
			this.dailedNumber=dailedNumber;
		}
		public int getTotalDuration()
		{
			return totalDuration;
		}
		public void setTotalDuration(int totalDuration)
		{
			this.totalDuration=totalDuration;
		}
		SummaryLog(String dn,int td)
		{
			this.dailedNumber=dn;
			this.totalDuration=td;
		}
		public static void main(String []args)
		{
			BufferedReader br;
			List<String[]> l=new ArrayList<>();
			try
			{
				String line;
				br=new BufferedReader(new FileReader("G:\\hcltraining\\CallLog.csv"));
				while((line=br.readLine()) !=null) {
					l.add(line.split(","));
				}	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			List<SummaryLog> lsl=new ArrayList<>();
			for(String[] li : l)
			{
				lsl.add(new SummaryLog(li[1],Integer.parseInt(li[2])));
			}
			Collections.sort(lsl);
			System.out.println("Call Logs");
			for(SummaryLog sl:lsl)
			{
				
				System.out.println(sl.getDailedNumber()+"\t"+sl.getTotalDuration());
			}
			//Collections.sort(lsl,Collections.reverseOrder());
			//for(SummaryLog s2: lsl)
			//{
			//	System.out.println(s2.getDailedNumber()+"\t"+s2.getTotalDuration());
			//}
		}
		@Override
		public int compareTo(SummaryLog o)
		{
			return (Integer.valueOf(this.getTotalDuration()).compareTo(o.getTotalDuration()));
		}
}

