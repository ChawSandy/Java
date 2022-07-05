package day4;


public class Array_Testing {

	public static void main(String[] args) {
		int[] arr1 = {100,20,200,40,90};
		for(var num : arr1)
		System.out.print(num+" ");
		
		int[] arr2 = Array.copyOf(arr1,arr1.length);
	}

}
