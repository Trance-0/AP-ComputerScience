package Barron_Homework;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Sentence {

	private String sentence = "ekcL CWNUETYOUR OWQMTUYITCU CWUIQRY";

	public List<Integer> getBlankPosision() {
		List<Integer> ret = new ArrayList<Integer>();
		int index = 0;
		while (index < sentence.length()) {
			String k = sentence.substring(index, index + 1);
			if (k.compareTo(" ") == 0) {
				ret.add(index);
			}
			index++;
		}
		return ret;
	}

	public List<Integer> getBlankPositions() {
		List<Integer> rec = new ArrayList<Integer>();
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.substring(i, i + 1).equals(" "))
				rec.add(i);
		}
		return rec;
	}

	public int countWords() {
		return getBlankPositions().size() + 1;
	}

	public String[] getWords() {
		String[] getWords = new String[countWords()];
		if (countWords() == 1) {
			getWords[0] = sentence.substring(0, sentence.length());
		} else {
			getWords[0] = sentence.substring(0, getBlankPositions().get(0));
			getWords[countWords()-1] = sentence.substring(getBlankPositions().get(getBlankPositions().size()-1),sentence.length());
			int index = 1;
			while (index < countWords()-1) {
				getWords[index] = sentence.substring(getBlankPositions().get(index-1),
						getBlankPositions().get(index));
				index++;
			}
		}
		return getWords;
	}
}
