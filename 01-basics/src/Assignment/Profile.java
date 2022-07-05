package Assignment;

import java.util.Scanner;

public class Profile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter full name: ");
		String name =sc.nextLine();
		System.out.print("Enter email: ");
		String uemail =sc.nextLine();
		System.out.print("Enter phone number: ");
		String phone =sc.nextLine();
		System.out.print("Enter your education: ");
		String education =sc.nextLine();
		System.out.print("Enter income: ");
		double income =sc.nextDouble();
		System.out.print("Enter age: ");
		int age =sc.nextInt();
		sc.close();
		
		
		System.out.println("\n------Your data-----");
		System.out.println("Name :" +name);
		System.out.println("Email :" +uemail);
		System.out.println("Phone No :" +phone);
		System.out.println("Education :" +education);
		System.out.println("income :"+income);
		System.out.println("Age :"+age);
		System.out.println();

	}

}
