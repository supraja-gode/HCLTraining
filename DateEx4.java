package org.hcl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class DateEx4 {
	public static void main(String[] args) {
        String string = "November 6, 2020";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);

        System.out.println(date);
    }
}
