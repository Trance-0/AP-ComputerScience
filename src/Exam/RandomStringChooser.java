package Exam;

import java.util.ArrayList;
import java.util.List;

public class RandomStringChooser {
	private List<String> wordArray=new ArrayList<String>();

	public RandomStringChooser(String[] k) {
		for(String temp: k) {
			wordArray.add(temp);
		}
	}

	public String getNext() {
		if (wordArray.size() > 0) {
			int windex = (int) (Math.random() * wordArray.size());
			return wordArray.remove(windex);
			}
		return "NONE";
	}
}
