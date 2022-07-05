package day6;

public class String_Buffer_Testing {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Java Programming ");
		
		buffer.append("language");
		System.out.println("After append, "+buffer);
		
		buffer.insert(5, "is a ");
		System.out.println("After insert, "+buffer);
		
		buffer.replace(0,4, ""
				+ "PHP");
		System.out.println("After replace, "+buffer);

		System.out.println("index of 'language' "+buffer.indexOf("language"));
		System.out.println("substring: " + buffer.substring(4));
		System.out.println("delete: " + buffer.delete(5, 10));
		System.out.println("After delete: " + buffer);
		
		
		int mark = 100;
		System.out.println("You got " + mark + " marks");
		if(mark >= 50) {
			System.out.println("Exam fail");
		}
		



	}

}
