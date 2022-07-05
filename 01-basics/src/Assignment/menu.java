package Assignment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		String[] menus = {"Pizza","Burger","Milk Tea","Spicy Noodle"};
		int[] times = {15,30,10,45};
		String[] townships = {"AA","BB","CC","DD"};
		String[] orderType = {"Order Now","Preorder"};
		System.out.println("***** Avilable Menu *****");
		//menu
		for (int i = 0; i < menus.length; i++) {
			System.out.println((i+1) +". "+ menus[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Please choose item :");
		int itemNo = sc.nextInt();
		String typeOfFood = null;
		for (int i = 0; i < menus.length; i++) {
			if(itemNo == i+1) {
				typeOfFood = menus[i];
				break;
			}
		}
		//deliverable township
		System.out.println("***** Deliverable township *****");
		for (int i = 0; i < townships.length; i++) {
	
			System.out.println((i+1)+". "+ townships[i]+"("+times[i] +" mins )");
			
		}
		System.out.print("Please choose township :");
		int NoOfTowns = sc.nextInt();
		String nameOfTown = null; 
		int waitTime = 0;
		for (int i = 0; i < townships.length; i++) {
			if(NoOfTowns == i+1) {
				nameOfTown = townships[i];
				waitTime = times[i];		
				break;
			}
}
		
		//order type
		System.out.println("***** Order Type *****");
		for (int i = 0; i < orderType.length; i++) {
			System.out.println((i+1)+". "+ orderType[i]);
		}
		System.out.print("Please choose 1 or 2 :");
		int NoOfOrder = sc.nextInt();
		 
		
		if(NoOfOrder == 1) {
			LocalTime today = LocalTime.now();
			DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
			System.out.println("***** Your Order Information *****");
			System.out.println("Item Name: "+typeOfFood);
			System.out.println("Your Address: "+nameOfTown);
			System.out.println("Duration: "+waitTime);
			System.out.println("Arrival Time: "+ today.plusMinutes(waitTime).format(f1));
			System.out.println("***** Thank you for your ordering *****");

		}else if(NoOfOrder == 2) {
			System.out.print("Enter deliver date(dd):");
			int Dday = sc.nextInt();
			LocalDate thisday = LocalDate.now();
			DateTimeFormatter f2 = DateTimeFormatter.ofPattern("EEEE,MMM dd yyyy");
			System.out.println("***** Your Order Information *****");
			System.out.println("Item Name: "+typeOfFood);
			System.out.println("Your Address: "+nameOfTown);
			System.out.println("Arrival Date: "+thisday.plusDays(Dday).format(f2) );
			System.out.println("***** Thank you for your ordering *****");
		}
	}

}
