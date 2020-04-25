package Chapter8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
