package Exam;

import Exam_2017.Phrase;

public class TEST {
	public static void main (String [] args) {
		Phrase phrase1= new Phrase ("aaaa");
		String[] s= {};
		phrase1.replaceNthOccurrence("aa", 1, "xx");
		System.out.println(s.length);
	}
}
