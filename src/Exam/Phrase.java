package Exam;

public class Phrase
{
    private String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p)
    { currentPhrase = p; }

    /** Returns the index of the nth occurrence of str in the current phrase;
     * returns -1 if the nth occurrence does not exist.
     * Precondition: str.length() > 0 and n > 0
     * Postcondition: the current phrase is not modified.
     */
    public int findNthOccurrence(String str, int n){
    	System.out.print(str);
    	return 0;
}

    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
     * If the nth occurrence does not exist, the current phrase is unchanged.
     * Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl){
    int beginIndex=findNthOccurrence(str, n);
    int endIndex=beginIndex+str.length();
    if (beginIndex!=-1) {
	currentPhrase=currentPhrase.substring(0, beginIndex)+repl+currentPhrase.substring(endIndex, currentPhrase.length());
    }
    }

    /** Returns the index of the last occurrence of str in the current phrase;
     * returns -1 if str is not found.
     * Precondition: str.length() > 0
     * Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str){ 
    	int times=1;
    	while (findNthOccurrence(str,times)!=-1) {
    		times++;
    	}
    	return findNthOccurrence(str,times);
    }

    /** Returns a string containing the current phrase. */
    public String toString()
    { return currentPhrase; }
}