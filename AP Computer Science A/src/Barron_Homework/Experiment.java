package Barron_Homework;

import java.util.List;

public class Experiment {
	/** The mechanical arm used to process the solutions */
	private MechanicalArm arm;
	/** The list of solutions */
	private List<Solution> solutions;

	/**
	 * Resets the experiment. Postcondition: - The mechanical arm has a current
	 * index of 0. - It is facing right.
	 */
	public void reset() {
		if (arm.isFacingRight() == true) {
			arm.changeDirection();
		}
		arm.moveForward(arm.getCurrentIndex());
		arm.changeDirection();
	}

	/**
	 * Finds and returns the index of the most acidic solution.
	 * 
	 * @return index the location of the most acidic solution or -1 if there are no
	 *         acidic solutions Postcondition: - The mechanical arm is facing right.
	 *         - Its current index is at the most acidic solution, or at 0 if there
	 *         are no acidic solutions.
	 */
//	public int mostAcidic() {
//		reset();
//		int mostAcidic = 7;
//		int index = -1;
//		for (int i = 0; i < solutions.size(); i++) {
//			int tempPH = solutions.get(i).getPH();
//			if (tempPH < mostAcidic) {
//				mostAcidic = tempPH;
//				index=i;
//			}
//			arm.moveForward(1);
//		} 
//		if(mostAcidic==7) {
//		reset();
//		}
//		else {
//			arm.changeDirection();
//			arm.moveForward(solutions.size()-index-1);
//		}
//		return index;
//	}
	
	public int mostAcidic() {
		reset();
		int mostAcidic = 7;
		int index = -1;
		int times =0;
		while (times < solutions.size()) {
			int tempPH = solutions.get(times).getPH();
			if (tempPH < mostAcidic) {
				mostAcidic = tempPH;
				index=times;
				times++;
			}
			arm.moveForward(1);
		} 
		if(mostAcidic==7) {
		reset();
		}
		else {
			arm.changeDirection();
			arm.moveForward(solutions.size()-index-1);
		}
		return index;
	}
}
