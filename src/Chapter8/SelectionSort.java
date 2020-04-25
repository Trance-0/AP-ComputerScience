package Chapter8;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
	
	public static void selectionSort2(List<Integer> list) {
		for(int i=0;i<list.size()-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<list.size();j++) {
				if(list.get(j)<list.get(minIndex)) {
					minIndex=j;
				}
			}
			int temp=list.get(i);
			list.set(i, list.get(minIndex));
			list.set(minIndex, temp);
		}
	}
	
	public static void selectionSort1(int[] elements) {
		for(int i=0;i<elements.length-1;i++) {
			int maxIndex=i;
			for(int j=i+1;j<elements.length;j++) {
				if(elements[j]>elements[maxIndex]) {
					maxIndex=j;
				} 
			}
			int temp=elements[i];
			elements[i]=elements[maxIndex];
			elements[maxIndex]=temp;
		}
	}
	
	public static void selectionSort(int[] elements){
		for(int j=0;j<elements.length-1;j++){
			int minIndex=j;
			for(int k=j+1;k<elements.length;k++){
				if(elements[k]<elements[minIndex]){
					minIndex=k;
				}
			}
			
			
//			System.out.println("��"+(j+1)+"��");
//			System.out.println("��Ҫ�������ǵ�"+minIndex+"��Ԫ�أ�"+elements[minIndex]+",����"+elements[j]+"����");
//			System.out.print("����ǰ��");
//			printArr(elements);
			
			int temp=elements[j];
			elements[j]=elements[minIndex];
			elements[minIndex]=temp;
			
			
//			System.out.println();
//			System.out.print("������");
//			printArr(elements);
//			System.out.println();
		}
	}
	
	public static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
	
	public static void main(String[] args) {
//		int[] arr={3,0,1,8,7,2,5,4,9,6};
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i+1);
		}
		for(int i=0;i<10;i++) {
			int s=(int)Math.random()*list.size();
			list1.add(list.get(s));
			list.remove(s);
		}
		System.out.println(list1);
		selectionSort2(list1);
		System.out.println(list1);
		
		//System.out.print("a"+"\t");
//		printArr(arr);
//		System.out.println();
//		System.out.println();
//		System.out.println("-------------");
//		selectionSort1(arr);
//		System.out.println("-------------");
//		System.out.println();
//		System.out.println();
//		printArr(arr);
	}

}
