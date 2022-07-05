package day5;

import java.time.LocalDate;

public class localdate {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 =  LocalDate.of(2022, 10, 15);
		LocalDate date3 = LocalDate.parse("2016-10-01");
		System.out.println("Date1 :"+date1);
		System.out.println("Date :"+date2);
		System.out.println("Date3 :"+date3);
		
		LocalDate tom = date1.plusDays(1);
		System.out.println("Tomorrow :"+ tom);
		System.out.println("Yesterday :"+date1.minusDays(1));
		
		System.out.println("Current Year :"+ date1.getDayOfYear());
		System.out.println("Current month :"+ date1.getMonthValue());
		System.out.println("Current Month :"+ date1.getMonthValue());
		System.out.println("Current Week :"+ date1.getDayOfWeek());
		System.out.println("Current Day of Month :"+ date1.getDayOfMonth());
		System.out.println(date1 +" is leap year that is "+ date1.isLeapYear());
		System.out.println(date2 +" is leap year that is "+ date2.isLeapYear());

	}

}
