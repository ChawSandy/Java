package day3;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Language:");
//		String lang = sc.nextLine();
//		
//		if (lang.equalsIgnoreCase("Java")) {
//			System.out.println("Best programming language.");	
//		}
		//if else
//		System.out.println("-----if else------");	
//		System.out.println("Enter email :");
//		String mail = sc.nextLine();
//		System.out.println("Enter password : ");	
//		String pass = sc.nextLine();
//		if(mail.equals("admin@gmail.com") && pass.equals("12345")) {
//			System.out.println("Login success");	
//		}else {
//			System.out.println("Login fail,try again");	
//		}
//		if else if
		
		System.out.print("Enter your bmi : ");
		float bmi = sc.nextFloat();
		if(bmi < 18.5) {
			System.out.println("Underweight");
		}
		
		else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Normal Weight");
		}

		else if(bmi >= 25 && bmi <= 29.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obesity");
		}


		sc.close();
	}

}
