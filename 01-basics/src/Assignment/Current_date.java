package Assignment;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Current_date {

	public static void main(String[] args) {
		String[] weekdays = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"};
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("E,MMM dd yyyy");
		LocalDate today = LocalDate.now();
		String s1 = null;
		System.out.println(f1.format(today));
		
		DayOfWeek thisday = today.getDayOfWeek();
		for (var weekday : weekdays) {

			if(weekday.equals(thisday.toString()) ) {
				 s1 = "I have no time. I am studying Programming Language.";
				break;
		
			}else {
				 s1 = "Today is my holiday!";
				 
			}
		}
		System.out.println(	"**********************************");
	

		System.out.println(s1);
		
	
		
	}
}


