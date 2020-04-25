package Chapter8;

public class Merge {
	public static void merge(int[] arr,int L,int M,int R){
		int LEFT_SIZE=M-L;
		int RIGHT_SIZE=R-M+1;
		int[] left=new int[LEFT_SIZE];
		int[] right=new int[RIGHT_SIZE];
		for(int i=L;i<M;i++){
			left[i-L]=arr[i];
		}
		for(int i=M;i<=R;i++){
			right[i-M]=arr[i];
		}
		int i=0;int j=0;int k=L;
		while(i<LEFT_SIZE && j<RIGHT_SIZE){
			if(left[i]>right[j]){
				arr[k]=right[j];
				j++;
				k++;
			}else{
				arr[k]=left[i];
				i++;
				k++;
			}
		}
		while(i<LEFT_SIZE){
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<RIGHT_SIZE){
			arr[k]=right[j];
			j++;
			k++;
		}
	} 
public static void mergeSort(int[] arr,int L,int R){
	if(L==R){
		return;
	}else{
		int M=(L+R)/2;
		mergeSort(arr,L,M);
		mergeSort(arr,M+1,R);
		merge(arr,L,M+1,R);
	}
}
	public static void main(String[] args) {
		int[] arr={2,8,9,10,4,5,6,7};
		int L=0;
		int R=7;
		int M=4;
		mergeSort(arr,L,R);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
