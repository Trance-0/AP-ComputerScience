package Exam_2014;

import java.util.ArrayList;
import java.util.List;

public class Scramble {
/** Scrambles a given word.
 * @param word the word to be scrambled
 * @return the scrambled word (possibly equal to word)
 * Precondition: word is either an empty string or contains only uppercase letters.
 * Postcondition: the string returned was created from word as follows:
 * - the word was scrambled, beginning at the first letter and continuing from left to right
 * - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
 * - letters were swapped at most once
 */
public static String scrambleWord(String word) {
	String result="";
	int i=1; 
	while(i<word.length()) {
		String temp=word.substring(i-1,i);
		String comp=word.substring(i, i+1);
		if (temp.equals("A")&&comp.compareTo("A")!=0) {
			result+=comp;
			result+=temp;
			i+=2;
		}
		else {
		result+=temp;
		i++;
		}
		if (i==word.length()) {
			result+=word.substring(i-1,i);
		}
	}
	return result;
}
/** Modifies wordList by replacing each word with its scrambled
* version, removing any words that are unchanged as a result of scrambling.
* @param wordList the list of words
* Precondition: wordList contains only non-null objects
* Postcondition:
* - all words unchanged by scrambling have been removed from wordList
* - each of the remaining words has been replaced by its scrambled version
* - the relative ordering of the entries in wordList is the same as it was
* before the method was called
*/

public static void scrambleOrRemove(List<String> wordList) {
	int i=0;
	while (i<wordList.size()) {
		String j=scrambleWord(wordList.get(i));
		if (j.compareTo(wordList.get(i))!=0) {
			wordList.set(i,j);
			i++;
		}
		else {
			wordList.remove(i);
		}
	}
}


public static void main (String  args[] ) 
{
	List<String> test =new ArrayList<String>();
	test.add("TAN");
	test.add("WHOA");
	test.add("APPLE");
	test.add("EGGS");
 System.out.print(scrambleWord("APPLE"));
 scrambleOrRemove(test);
 System.out.println(test);
}
}