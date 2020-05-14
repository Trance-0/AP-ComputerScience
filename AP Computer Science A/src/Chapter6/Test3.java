package Chapter6;

import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
	public static void removeTwos(List<String> strList) {
		Iterator<String> itr = strList.iterator();
		while (itr.hasNext())
			if (itr.next().length() == 2)
				itr.remove();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
//		list.add("student a");
//		list.add("student b");
//		list.add("st");
//		list.add("student c");
//		list.add("st");
//		list.add("st");
//		list.add("student d");
//		list.add("st");
//		list.add("student e");
//		System.out.println(list);
////		for(String s:list) {
////			if(s.contentEquals("stu5")) {
////				list.add("stu6");
////			}
////		}
////for(int i=0;i<5;i++) {
////	if(i==2) {
////		list.set(2,"stu6");
////	}
////}
////		for(int i=0;i<5;i++) {
////	if(i==2) {
////		list.set(2,"stu6");
////	}
////}
////	for(int i=0;i<list.size();i++) {
////		list.remove(list.size()-1);
////	}
////		int i = 0;
////		while (i < list.size()) {
////			list.remove(list.size() - 1);
////		}
//		removeTwos(list);
//		System.out.println(list);
//
//	}
//
//}

	}
}
