package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData_bufferreaderr {

	public static void main(String[] args) throws IOException {
		//create obj
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//operation
		System.out.print("Enter name :" );
		String name = reader.readLine();
		System.out.print("Enter salary :");
		int salary = Integer.parseInt(reader.readLine());
		System.out.print("Enter bonus :");
		float bonus = Integer.parseInt(reader.readLine());
		//close obj
		reader.close();
		System.out.println("\n------Your data-----");
		System.out.println("Name :" +name);
		System.out.println("Salary :"+salary);
		System.out.println("Bonus :"+bonus);
		System.out.println();


		
	}

}
