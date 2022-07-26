package day6;

import java.util.Scanner;

public class try_catch {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num1 :" );
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.println("Enter num2 :" );

			int num2 = Integer.parseInt(sc.nextLine());
			 var result = num1/num2;
			 System.out.println("Result :"+result);
			sc.close();
		} catch (ArithmeticException obj1) {// execute when exception occurs in try block
			System.err.print("Divisor must not be zero.");
		} catch (NumberFormatException obj2) {// execute when exception occurs in try block
			System.err.print("User input must be number.");
		} catch (Exception obj3) {// execute when exception occurs in try block
			System.err.println(obj3.getMessage());
		}  
			System.out.println();
			System.out.println("Outside try and catch block");
		
		
	}


}
