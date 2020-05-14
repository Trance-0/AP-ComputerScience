package Chapter3;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public final static int NUM_TESTS = 3;
	public String name;
	public double[] tests;
	public String grade;

	public Student() {
		name = "";
		tests = null;
		grade = "";
	}

//constructor
	public Student(String studName, double[] studTest, String studGrade) {
		name = studName;
		tests = studTest;
		grade = studGrade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setTest(double[] tests) {
		this.tests = tests;
	}

	public double[] getTest() {
		return tests;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getTestAverage() {
		double total = 0;
		int i = 0;
		while (i < NUM_TESTS) {
			total += tests[i];
			i++;
		}
		return total / NUM_TESTS;
	}

	public void computeGrade() {
		if (name.equals("")) {
			grade = "No grade";
		} else if (getTestAverage() >= 65) {
			grade = "Pass";
		} else {
			grade = "Fail";
		}
	}
}
