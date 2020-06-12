package my_class_learning;
//import Date class
import java.util.Date;  
import java.time.*;

public class MyDate {
	public static void main(String[] string) {
		Date date_var = new Date();
		System.out.println(date_var.toString());
		
		// LocalDate: parse/now/isBefore/isAfter/getMonth/getYear/getDayofWeek etc
		LocalDate myLocalDate = LocalDate.parse("2020-05-20");
		
		System.out.println("LocalDate.now(): "+myLocalDate);
		System.out.println("Year: " + myLocalDate.getEra());
		
		
		// CalendarTest
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today - 1);
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();  //1=Monday,..., 7=Sunday
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 0; i < value; i++) {
			System.out.print("   ");
		}
		while (date.getMonthValue() == month) {
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today) {
				System.out.print("*");
			}
			else
				System.out.print(" ");
			
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1) {
				System.out.println();
			}
			if (date.getDayOfWeek().getValue() != 1) {
				System.out.print("");
			}
		}
		
		
		
	}

}
