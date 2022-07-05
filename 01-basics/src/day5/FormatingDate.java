package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatingDate {

	public static void main(String[] args) {
			DateTimeFormatter format1 = DateTimeFormatter.BASIC_ISO_DATE;
			DateTimeFormatter format2 = DateTimeFormatter.ISO_LOCAL_TIME;
			DateTimeFormatter format3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
			
			LocalDate date =LocalDate.now();
			LocalTime time =LocalTime.now();
			
			LocalDateTime datetime =LocalDateTime.now();
			
			String output = date.format(format1);
			
			 
			System.out.println(output);
			System.out.println("Time format :" + format2.format(time));
			System.out.println("Date format :" + datetime.format(format3));
			
//			custom pattern
			
			DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd MM yyyy");
			DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh-mm-ss");
			DateTimeFormatter f3 = DateTimeFormatter.ofPattern("E,MMM dd yyyy");
			DateTimeFormatter f4 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' hh:mm:ss");
			DateTimeFormatter f5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
			DateTimeFormatter f6 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
			DateTimeFormatter f7 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

			System.out.println("Current date : "+date.format(f1));
			
			System.out.println("Current time : "+time.format(f2));
			System.out.println("Current datetime : "+datetime.format(f3));
			System.out.println("Current dateand time : "+datetime.format(f4));
			System.out.println("Size");

			System.out.println("Current date : "+date.format(f5));
			System.out.println("Current time : "+time.format(f6));

			System.out.println("Current datetime : "+datetime.format(f7));

	}

}
