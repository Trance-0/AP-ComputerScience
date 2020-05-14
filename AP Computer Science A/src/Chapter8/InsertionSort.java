package Chapter8;

public class InsertionSort {
	public static void insertionSort(int[] elements){
		printArr(elements);
		for(int j=1;j<elements.length;j++){
			int temp=elements[j];
			System.out.println("temp:"+temp);
			int possibleIndex=j;
			System.out.println("possibleIndex:"+possibleIndex);
			while(possibleIndex>0 && temp<elements[possibleIndex-1]){
				elements[possibleIndex]=elements[possibleIndex-1];
				possibleIndex--;
				printArr(elements);
				System.out.println();
				System.out.println("possibleIndex:"+possibleIndex);
			}
			elements[possibleIndex]=temp;
			//System.out.print(j+"\t");
			printArr(elements);
		}
	}
	public static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr={5,8,3,1,2,7,4,6};
//		int[] arr={8,1,4,6};
		insertionSort(arr);
		printArr(arr);

	}

}
