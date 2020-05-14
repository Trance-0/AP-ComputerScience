package Exam_2017;

import java.util.ArrayList;

public class Digit{
    /** The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;
    /** Constructs a Digits object that represents num.
     * Precondition: num >= 0
     */
    public Digit(int num){ 
    	while (num>0){
    		int temp=num%10;
    		num=num/10;
    		digitList.add(0,temp);
    	}
}
    /** Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
//    public boolean isStrictlyIncreasing(){ 
//    	boolean isStrictlyIncreasing=true;
//    	int former=digitList.get(0);
//    	for (int i=1;i<digitList.size();i++) {
//    		if (former>=digitList.get(i)) {
//    			isStrictlyIncreasing=false;
//    		}
//    		former=digitList.get(i);
//    	}
//    	return isStrictlyIncreasing;
// }
    public boolean isStrictlyIncreasing(){
    	for (int i=0;i<digitList.size()-1;i++) {
    		if (digitList.get(i)>=digitList.get(i+1)) {
    			return false;
    		}
    	}
    	return true;
 }
}