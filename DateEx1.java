package org.hcl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DateEx1 {
	public static void main(String args[])
	{
		List<Date> listDates = new ArrayList<Date>();
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		 
		try {
		    listDates.add(dateFormatter.parse("2013-09-30"));
		    listDates.add(dateFormatter.parse("2013-07-06"));
		    listDates.add(dateFormatter.parse("2013-11-28"));
		} catch (ParseException ex) {
		    System.err.print(ex);
		}
		 
		System.out.println("Before sorting: " + listDates);
		 
		Collections.sort(listDates);
		 
		System.out.println("After sorting: " + listDates);
	}
}
