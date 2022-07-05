package day3;

import java.util.Scanner;

public class Switch_expression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter food name : ");
		String name = sc.nextLine();
		String category = 
				switch(name) {
					case "burger","pizza","sandwich" -> "Fast Food";
					case "yogurt","milk tea" -> "Dessert";
					case "mohinga" -> "Burmese Food";
					case "sushi" -> "Japanese Food";
					default -> "unknown";
		};
//		String category = 
//				switch(name) {
//				
//				};
			
		System.out.println(name + " is " + category);
	}
}
