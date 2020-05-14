package Exam_2015;

public class HiddenWord {
	private String hidden_word="";
	public HiddenWord(String hidden) {
		hidden_word=hidden;
	}
	public String getHint(String guess) {
		String result="";
		for (int i=0; i<hidden_word.length();i++) {
			String hidden=hidden_word.substring(i, i+1);
			String temp=guess.substring(i, i+1);
			if (hidden.equals(temp)) {
				result+="hidden";
			}
			else if (hidden_word.indexOf(temp)>0) {
				result+="+";
			}
			else {
				result+="*";
			}
		}
		return result;
	}
}
