package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class User_NRCNO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your nrcno: ");
		String nrcno = sc.nextLine();
		
		System.out.println(nrcno);
		String[] arr = nrcno.split("\\(");
		String[] arr1 = arr[0].split("/");
		String[] arr2 =arr[1].split("\\)");
			
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));

		System.out.println("Township :"+ arr1[1]);
		System.out.println("Number :"+ arr2[1]);

		
	}

}
