package Assignment;

import java.util.Scanner;

public class Question_or_not {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a sentance: ");
			String sentence = sc.nextLine();
			String[] ques = new String[] {"Did","did","Were","were","was","Was"};
			

			String[] data = sentence.split(" ");
//		System.out.println(Arrays.toString(data));
			if(sentence.endsWith("?")) {
				System.out.println("It is question sentence.");
				String first_word = data[0].toLowerCase();
				String whWord = "how,what,who,which,when,why";
				System.out.println("First of the sentence: "+data[0]);
				if(whWord.contains(first_word)) {
					System.out.println("It is wh-question.");
				}
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
