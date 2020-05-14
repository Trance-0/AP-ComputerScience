package Chapter8;

import java.util.Arrays;

public class sequentialSearch {
	public static int search(int[] arr,int value){
		int i=0;
		int n=arr.length;
		while(i<n && value!=arr[i]){
			i++;
		}
		if(i==n){
			return -1;
		}else{
			return i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,5,9,6,3,2,7};
//		Arrays.sort(arr);
		System.out.println(search(arr,10));
	}

}
