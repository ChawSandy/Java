package Expection_assignment;

import java.util.Arrays;
import java.util.Scanner;


public class Assignment1_exp {
	public static void main(String[] args) {

		String[] numbers =new String[5];
			try(Scanner sc = new Scanner(System.in)){
				System.out.println("Enter the divoser for average: ");
				
				int count = sc.nextInt();
				System.out.println("Enter your numbers: ");
				for(int j = 0; j < 5
						;j++) {
					String no1 = sc.next();
					numbers[j] = no1; 
					
				}
			
			System.out.println(Arrays.toString(numbers));
		
			int max_num = Integer.parseInt(numbers[0]);
			int min_num = Integer.parseInt(numbers[0]);
			int sum = 0;
			
			for(int i = 0; i < numbers.length; i++) {
				int num = Integer.parseInt(numbers[i]);
				sum += num;
				if(max_num < num) {
					max_num = num;
				}
				if(min_num > num ) {
					min_num = num;
				}
			}
			
	
			System.out.println("Average" +sum/count);
			System.out.println("Max :" + max_num);
			System.out.println("Min :" + min_num);
			
			numbers[6]= "9";
			if(numbers.length > 5)
				throw new IndexOutOfBoundsException("index out of bounds"); 
//			
		}
		
		catch(ArithmeticException obj1) {
			System.err.println(obj1.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException obj) {
			System.err.println(obj.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
