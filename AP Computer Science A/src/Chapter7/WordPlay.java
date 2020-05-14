package Chapter7;

import java.util.Scanner;

public class WordPlay {
	public static void stackWords() {
		Scanner in = new Scanner(System.in);
		String word = in.next();
		if (word.equals(".")) {
			System.out.println();
		} else {
			stackWords();

		}
		System.out.println(word);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter list of words,one please.");
		System.out.println("Final word should be a period(.).");
		stackWords();
	}

}
