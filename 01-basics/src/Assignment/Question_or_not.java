package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_or_not {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		String sentence = sc.nextLine();
		
		String[] data = sentence.split(" ");
//		System.out.println(Arrays.toString(data));
		if(sentence.endsWith("?")) {
			System.out.println("It is question sentence.");
			String first = data[0];
			System.out.println("First of the sentence: "+first);
			
			String[] ques = new String[] {"Did","did","Where","were","was","Was"};
			int result = -1;
			
			for(int i = 0 ; i < ques.length ;i++) {
				if(sentence.contains(ques[i])){
					result = 1;
					break;
				}
			}
			if(result == 1) {
				System.out.println("It is past tense.");
			}else {
				System.out.println("It is present tense.");

			}

		}else {
			System.out.println("It is not question sentence.");

		}
	
	}

}
