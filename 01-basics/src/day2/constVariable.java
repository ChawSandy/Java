package day2;

import java.util.Scanner;
//import day1.Introduction;

public class constVariable {
	static final float RATE = 1.5f;
	static final int MIN_PRICE = 1000;
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter price" );
	 int price = sc.nextInt();
	
//	Introduction obj;	
	 if(price < MIN_PRICE) {
		 price = MIN_PRICE;
	 }
	 System.out.println("Price" + price);
	 System.out.println("Expense" + price*RATE);
//	 RATE = 3.5f;
	}

}
