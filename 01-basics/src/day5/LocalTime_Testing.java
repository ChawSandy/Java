package day5;

import java.time.LocalTime;

public class LocalTime_Testing {

	public static void main(String[] args) {
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(4,30,29);
		LocalTime time3 = LocalTime.parse("04:50");
		
		System.out.println("T1 :"+ time1);
		System.out.println("T2 :"+ time2);
		System.out.println("T3 :"+ time3);
		
	
	}

}
