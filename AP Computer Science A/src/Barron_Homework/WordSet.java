package Barron_Homework;

public class WordSet
{
/** Constructor initializes set to empty. */
public WordSet()
{ /* implementation not shown */ }
/** @return the number of words in set */
public int size()
{
	return 0; /* implementation not shown */ }
/** Adds word to set (no duplicates).
* @param word the word to be added
*/
public void insert(String word)
{ /* implementation not shown */ }
/** Removes word from set if present, else does nothing.
* @param word the word to be removed
*/
public void remove(String word)
{ /* implementation not shown */ }
/** Returns kth word in alphabetical order, where 1 <= k <= size().
* @param k position of word to be returned
* @return the kth word
*/
public String findkth(int k)
{
	return null; /* implementation not shown */ }
/** @return true if set contains word, false otherwise */
public boolean contains(String word)
{
	return false; /* implementation not shown */ }
//Other instance variables, constructors, and methods are not shown.

/** @param s the current WordSet
* @return the number of words in s that begin with "A"
*/
public static int countA(WordSet s) {
	int i=1;
	while(s.findkth(i).substring(0,1).equals("A")&&i<=s.size()) {
		i++;
		}
	return i-1;
}

/** @param s the current WordSet
* Postcondition: WordSet s contains no words that begin with
* "A", but is otherwise unchanged.
*/
public static void removeA(WordSet s) {
	int numA=countA(s);
	for(int i=0; i<numA;i++) {
		s.remove(s.findkth(1));
	}
	}
/** @param s1 the first given set
* @param s2 the second given set
* @return the WordSet containing only the elements that occur
* in both s1 and s2
*/
public static WordSet commonElements(WordSet s1, WordSet s2) {
	WordSet commonElements=new WordSet();
	for (int i=1; i<=s1.size();i++) {
		if (s2.contains(s1.findkth(i))){
			commonElements.insert(s1.findkth(i));
		}
	}
	return commonElements;
}
}
