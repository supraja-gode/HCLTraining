package org.hcl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateEx2 {
	public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2009-12-31");
        Date date2 = sdf.parse("2010-01-31");

        System.out.println("date 1 : " + sdf.format(date1));
        System.out.println("date 2 : " + sdf.format(date2));

        if (date1.compareTo(date2) > 0) {
            System.out.println("Date 1 is after Date 2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date 1 is before Date 2");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date 1 is equal to Date 2");
        } else {
            System.out.println("How to get here?");
        }
    }
}
