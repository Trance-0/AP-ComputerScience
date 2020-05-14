package Exam_2019;

import java.util.ArrayList;
import java.util.List;

public class StepTracker {
	private List<Integer> Tracker = new ArrayList<Integer>();
	private int activeSteps = 0;
	private int steps = 0;

	public StepTracker(int steps) {
		activeSteps = steps;
	}

	public void addDaliySteps(int addsteps) {
		Tracker.add(addsteps);
	}

	public int activeDates() {
		int activeDates = 0;
		for (int i = 0; i < Tracker.size(); i++) {
			if (Tracker.get(i) >= activeSteps) {
				activeDates++;
			}
		}
		return activeDates;
	}

	public double avarageSteps() {
		double avarageSteps = 0.0;
		for (int i = 0; i < Tracker.size(); i++) {
			avarageSteps += Tracker.get(i);
		}
		return  avarageSteps / Tracker.size();
	}
	
}
