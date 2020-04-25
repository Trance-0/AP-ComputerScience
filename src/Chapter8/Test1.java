package Chapter8;

import java.util.Arrays;

public class Test1 {
	public static void swap(int i,int j){
		int temp=i;
		i=j;		
		j=temp;
		System.out.println("swap once.");
	}
	public static void insertionSort(int[] arr){
		int i,j,min,temp,n=arr.length;
		for(i=0;i<n-1;i++){
			min=i;
			for(j=i+1;j<n;j++){
				if(arr[j]<arr[i]){
					min=j;
					//swap(arr[i],arr[min]);
				}
				printArr(arr);
			}
//			temp=arr[min];
//			arr[min]=arr[i];
//			arr[i]=temp;
			swap(arr[min],arr[i]);
			
			System.out.println("--------------i="+i);
			
		}
	}
	
	public static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr={8,6,4,1};
		printArr(arr);
		insertionSort(arr);
		printArr(arr);

	}

}
