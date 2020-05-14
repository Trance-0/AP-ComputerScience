package Exam_2018;

public class CodeWordChecker implements Stringchecker {
	private int start = 0;
	private int end = 0;
	private String sp = "";

	public CodeWordChecker(int starts, int ends, String spe) {
		start = starts;
		end = ends;
		sp = spe;
	}

	@Override
	public boolean isValid(String str) {
		// TODO Auto-generated method stub
		return start <= str.length() && str.length() <= end && str.indexOf(sp) == -1;
	}

}
