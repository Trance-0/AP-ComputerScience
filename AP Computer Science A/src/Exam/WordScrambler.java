package Exam;

import java.util.ArrayList;
import java.util.List;

public class WordScrambler {
    private String[] scrambledWords;

    public WordScrambler(String[] wordArr) {
        scrambledWords = mixedWords(wordArr);
    }

    private String recombine(String word1, String word2) {
        return word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2);
    }

    private String[] mixedWords(String[] words) {
        for (int i = 0; i < words.length / 2; i++) {
            String word1 = words[2 * i];
            String word2 = words[2 * i + 1];
            words[2 * i] = recombine(word1, word2);
            words[2 * i + 1] = recombine(word2, word1);
        }
        return words;
    }
}