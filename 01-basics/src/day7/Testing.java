package day7;

import java.util.Scanner;

import javax.swing.tree.ExpandVetoException;

public class Testing {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter your age: ");
			var age = sc.nextInt();
			validateAge(age);//exception
		}
		catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private static void validateAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age must be at least 18.");
		}else {
			System.out.println("You can smoke!");
		}
	}

}

class InvalidAgeException extends Exception {
		
	
	private static final long serialVersionUID = 1L;		
		public InvalidAgeException(String msg) {
			super(msg);
		}


		
}