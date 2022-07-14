package Assignment;

import java.util.Arrays;

public class Paragraph_Assignment {

	public static void main(String[] args) {
		String s1 = new String("Maecenas nec quam libero. Mauris bibendum arcu eu tellus scelerisque, eget egestas ante maximus. Quisque tristique fermentum enim, a placerat massa ultricies ac. Nullam eu lobortis eros, a lobortis ante. Aliquam erat volutpat. Duis vel magna posuere, semper nibh sodales, vestibulum leo. Sed aliquet quis tellus a placerat. Praesent id congue quam. Nam ullamcorper vestibulum ex quis ullamcorper. Proin mollis diam ut sodales viverra. Donec volutpat nibh et tortor blandit, vitae tempus mi condimentum. Nunc eget vehicula ipsum.");
		String[] data1 = s1.split(" ");
//		System.out.println(Arrays.toString(data1));
		System.out.println("Total words :"+data1.length);
		String[] data2 = s1.split("\\.");
//		System.out.println(Arrays.toString(data2));
		System.out.println("Total sentences :"+data2.length);
		
		String[] data3 = s1.split("");
//		System.out.println(Arrays.toString(data3));
		System.out.println("Total characters :"+data3.length);
		
	}

}
