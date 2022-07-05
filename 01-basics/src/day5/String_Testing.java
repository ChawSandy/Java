package day5;

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
		
//		subString
		
		var substr = s2.substring(0, 4);
		System.out.println(substr);



	}

}
