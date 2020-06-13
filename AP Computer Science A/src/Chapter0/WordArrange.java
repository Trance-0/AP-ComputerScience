package Chapter0;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WordArrange {
	private static int mpl = 100;

	public static void main(String[] args) {
		//get input 
		Scanner a = new Scanner(System.in);
		String userInput = a.nextLine();
		//cut the input into several words
		String[] character = userInput.split(" ");
		//the index in character 
		int index=0;
		//when there is words that didn't put in
		while (index<character.length) {
			//create a list
			List<String> c = new ArrayList<String>();
			//current word count 
			int cwc=0;
			//when there length of the string is less than 100
			while(cwc+character[index].length()+1<mpl) {
				//add the character into print list
				c.add(character[index]);
				//add current wordCount
				cwc=cwc+character[index].length()+1;
				//add index
				index++;
				if (index==character.length) {
					break;
				}
			}
			//print the words
			for (String i :c) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
