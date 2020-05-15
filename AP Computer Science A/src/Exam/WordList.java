package Exam;

import java.util.List;
import java.util.ArrayList;

public class WordList {
    private ArrayList<String> myList;

    public int numWordsOfLength(int len) {
        int result = 0;
        for (String i : myList) {
            if (i.length() == len) {
                result++;
            }
        }
        return result;
    }

    public void removeWordOfLength(int len) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() == len) {
                myList.remove(i);
                i--;
            }
        }
    }
    
}