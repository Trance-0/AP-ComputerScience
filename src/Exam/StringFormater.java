package Exam;

import java.util.List;

public class StringFormater {

	public static int totalLetters(List<String> wordList) {
		int totalLetters = 0;
		for (String temp : wordList) {
			totalLetters += temp.length();
		}
		return totalLetters;

	}

	/**
	 * Returns the basic gap width when wordList is used to produce a formatted
	 * string of formattedLen characters. Precondition: wordList contains at least
	 * two words, consisting of letters only. formattedLen is large enough for all
	 * the words and gaps.
	 */
	public static int basicGapWidth(List<String> wordList, int formattedLen) {
		return (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);
	}

	/**
	 * Returns the total number of letters in wordList. Precondition: wordList
	 * contains at least two words, consisting of letters only.
	 */

	/**
	 * Returns the number of leftover spaces when wordList is used to produce a
	 * formatted string of formattedLen characters. Precondition: wordList contains
	 * at least two words, consisting of letters only. formattedLen is large enough
	 * for all the words and gaps.
	 */
	public static int leftoverSpaces(List<String> wordList, int formattedLen) {
		return formattedLen;
	}

	/**
	 * Returns a formatted string consisting of the words in wordList separated by
	 * spaces. Precondition: The wordList contains at least two words, consisting of
	 * letters only. formattedLen is large enough for all the words and gaps.
	 * Postcondition: All words in wordList appear in the formatted string. - The
	 * words appear in the same order as in wordList. - The number of spaces between
	 * words is determined by basicGapWidth and the distribution of leftoverSpaces
	 * from left to right, as described in the question.
	 */
	public static String format(List<String> wordList, int formattedLen) {
		String result = wordList.get(0);
		int k=leftoverSpaces(wordList,formattedLen) ;
		for (int i = 1; i < wordList.size(); i++) {
			int j = 0;
			while (j < basicGapWidth(wordList, formattedLen)) {
				result += " ";
				j++;
			}
			if (k>0) {
				result += " ";
				k--;
			}
			result+=wordList.get(i);
		}
		return result;
	}
}