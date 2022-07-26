package Expection_assignment;

import java.util.Scanner;

public class Nrc_arr {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your nrcno: ");
			String nrcno = sc.nextLine();
			
			System.out.println(nrcno);
			String[] arr = nrcno.split("\\(");
			String[] arr1 = arr[0].split("/");
			String[] arr2 =arr[1].split("\\)");
			int mydiv = Integer.parseInt(arr1[0]);
			String[] division = {"AA","BB","CC","DD","EE","FF","GG","HH","II","JJ","KK","LL","MM","NN"};
			String div = null;
			for(int i = 0; i < division.length; i++ ) {
				if(mydiv == (i+1)) {
					div = division[i];
					break;
				}
		}
			if(mydiv > division.length) {
				throw new IndexOutOfBoundsException("Invalid nrc");
			}
			System.err.println("Division/state: "+ div);
			System.out.println("City :"+ arr1[1]);
			System.out.println("Number :"+ arr2[1]);
			
			
		}
		catch(IndexOutOfBoundsException obj){
			System.err.println(obj.getMessage());
		}
		catch(Exception obj1){
			System.err.println(obj1.getMessage());
		}

	}

}
