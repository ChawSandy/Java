package day3;

import java.util.Scanner;

public class Condition_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter food name : ");
		String name = sc.nextLine();
		String category;
		switch(name) {
//		case "burger" :
//				category = "Fast Food";
//				break;
//		case "pizza" :
//				category = "Fast Food";
//				break;
//		case "sandwich" :
//				category = "Fast Food";
//				break;
		case "burger" , "pizza", "sandwich" :
		category = "Fast Food";
		break;
//		case "yogurt" :
//				category = "Dessert";
//				break;
//		case "milk tea" :
//				category = "Dessert";
//				break;
		case "yogurt" ,"milk tea":
			category = "Dessert";
			break;
		case "mohinga" :
				category = "Burmese Food";
				break;
		case "sushi" :
				category = "Japanese Food";
				break;
		default :
				category = "unknown";
		}
		System.out.println(name + " is " + category);
		boolean result =(3 == 4) &&(3 > 4);
		sc.close();
	}

}
