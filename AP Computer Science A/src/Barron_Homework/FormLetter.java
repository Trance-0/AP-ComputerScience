package Barron_Homework;

import java.util.ArrayList;
import java.util.List;

public class FormLetter {
    /** The list of lines that make up this form letter */
    private List<String> lines;
    /** The list of customers */
    private List<Customer> customers;

    /** @return a copy of lines */
    public List<String> makeCopy() {
        List<String> newLines = new ArrayList<String>();
        for (String line : lines)
            newLines.add(line);
        return newLines;
    }

    /**
     * Replace all occurrences of sub in line with replacement string, repl.
     * 
     * @param line        a String
     * @param sub         a substring to be replaced
     * @param replacement the replacement string Precondition: sub is not a
     *                    substring of repl, the replacement string.
     * @return line with each occurrence of sub replaced by replacement
     */
    public String replaceAll(String line, String sub, String repl) {
        int subLength = sub.length();
        int starter = 0;
        while (line.indexOf(sub) > 0) {
            starter = line.indexOf(sub);
            line = line.substring(0, starter) + repl + line.substring(starter + subLength);
        }
        return line;
    }

    /**
     * Write letter for one customer, using personalized lines contained in
     * customerLines.
     * 
     * @param customerLines the personalized lines for one customer
     */
    public void writeLetter(List<String> customerLines) {
        /* implementation not shown */ }

    /**
     * Creates and prints a personalized form letter for each customer in the
     * customers list. Postcondition: In each customer letter: - every occurrence of
     * "@" is replaced by the customer’s name; - every occurrence of "&" is replaced
     * by the customer’s city; - every occurrence of "$" is replaced by the
     * customer’s state. - A letter with the replacements is printed for each
     * customer.
     */
    public void createPersonalizedLetters() {
        for (Customer i : customers) {
            List<String> newLine=makeCopy();
            for (int j=0;j<newLine.size();j++) {
                newLine.set(j,replaceAll(newLine.get(j), "@", i.getName()));
                newLine.set(j,replaceAll(newLine.get(j), "&", i.getCity()));
                newLine.set(j,replaceAll(newLine.get(j), "@", i.getState()));
            }
            writeLetter(newLine);
        }
    }
    // Constructors and other methods are not shown.
}