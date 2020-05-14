package Exam_2015;

import java.util.ArrayList;
import java.util.List;

public class MutipleGroup extends Range{
	 public MutipleGroup(int min, int max) {
		super(min, max);
		// TODO Auto-generated constructor stub
	}

	 private List<NumberGroup> groupList=new ArrayList<NumberGroup>();
	public boolean contains(int num){
			for (NumberGroup group : groupList){
	            if (group.contains(num)){
	                return true;
	            }
	        }
	        return false;
}
}
