package Expection_assignment;

import java.util.Scanner;

public class User_defineExp {
	private static void validatemarks(int num) throws InvalidMarksException {
		if(num < 0 || num > 100 ) {
			throw new InvalidMarksException("Invalid mark!");
		}else {
			System.out.println("Your entry mark is"+ num);
		}
	}
	public static void main(String[] args) throws InvalidMarksException {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter your number: ");
			int mark = sc.nextInt();
			validatemarks(mark);
		}
		catch (InvalidMarksException e) {
			System.err.println(e.getMessage());
		}
	}
	
}

class InvalidMarksException extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidMarksException(String msg) {
		super(msg);
	}
	
}
