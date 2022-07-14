package day5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Testing {

	public static void main(String[] args) {
		String s1 = new String(new char[] {'Y','W','K'});
		String s2 =new String("Java Programming");
		String s3 =new String("Myanmar IT Consulting");

		System.out.println(s1);
		System.out.println("length of s1: " +s1.length());

		System.out.println(s2);
		System.out.println("length of s2: " +s2.length());
		System.out.println("s3's uppercase: "+s3.toUpperCase());
		
		System.out.println("after changing"+ s3);
		
		//subString
		
		var substr = s2.substring(0, 4);
		System.out.println(substr);
		System.out.println("after substring :"+s2);
		System.out.println(" substring :"+s2.substring(8));
		
		//replace
		
		var output = s2.replace("Java", "Spring");
		System.out.println("replace: " +output);
		System.out.println("after replacing :"+s2);
		
		//concat
		
		System.out.println("Concat :"+s2.concat("Language"));
		System.out.println("After concat :"+s2);

		//contain
		System.out.println(s2.contains("Java"));
		//startwith
		System.out.println("startwith :"+s2.startsWith("php"));
		//endwith
		System.out.println("endwith :"+s2.endsWith("ing"));
				
		//location
		System.out.println("index of a :"+ s2.indexOf("a"));
		System.out.println("index of a :"+ s2.lastIndexOf("a"));
		System.out.println("index of abc :"+ s2.indexOf("abc"));
		//split
		String[] data = s2.split("");
		System.out.println("data[0] :"+data[0]);
		System.out.println("No of words :"+data.length);
		System.out.println(Arrays.toString(data));

		char[] characters = s2.toCharArray();
		System.out.println(characters);
		System.out.println("char array :"+ Arrays.toString(characters));
		//convert string to any data type
		String s4 = String.valueOf(characters);
		System.out.println("s4 :"+ s4);

		 s4 = String.valueOf(1000);
		 System.out.println(s4);

	}

}
