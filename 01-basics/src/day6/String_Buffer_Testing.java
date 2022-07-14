package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Buffer_Testing {

	public static void main(String[] args) throws IOException {
		StringBuffer buffer = new StringBuffer("Java Programming ");
		System.out.println("Number of character: "+buffer.length());
		buffer.append("language");
		System.out.println("After append, "+buffer);
		
		buffer.insert(5, "is a ");
		System.out.println("After insert, "+buffer);
		
		buffer.replace(0,4, "PHP");
		System.out.println("After replace, "+buffer);

		System.out.println("index of 'language' "+buffer.indexOf("language"));
		System.out.println("substring: " + buffer.substring(4));
		System.out.println("Number of character: "+buffer.length());

		System.out.println("delete: " + buffer.delete(4, 9));
		System.out.println("After delete: " + buffer);
		
		
		int mark = 100;
		System.out.println("You got " + mark + " marks");
		if(mark >= 50) {
			System.out.println("Exam fail");
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = reader.readLine();



	}

}
