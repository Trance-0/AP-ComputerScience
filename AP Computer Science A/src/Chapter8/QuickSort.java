package Chapter8;

public class QuickSort {
	public static void quickSortHelper(int[] arr,int left,int right){
		int i,j,t,temp;
		if(left>right){
			return;
		}
		temp=arr[left];  //�����׼��
		i=left;	        //��ߵ�����
		j=right;        //�ұߵ�����
		while(i!=j){                  //�����������û������
			while(arr[j]>=temp && i<j){ //�ұߵ������Ȼ�׼����  ���� ��߱��ұ�С
				j--;					//�ұߵ�������һ��
			}
			while(arr[i]<=temp && i<j){ //��ߵ������Ȼ�׼��С ����  ��߱��ұ�С
				i++;			        //��ߵ�������һ��
			}
			if(i<j){          //������С���ұ�
				t=arr[i];       //�����ǽ���
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		arr[left]=arr[i];   //�ѻ�׼�����������м��������
		arr[i]=temp;	
		quickSortHelper(arr,left,i-1);
		quickSortHelper(arr,i+1,right);
	}	
	public static void quickSort(int[] arr){
		quickSortHelper(arr,0,arr.length-1);
	}	
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr={9,7,5,3,8,6,4,1,2};
		quickSort(arr);
		printArr(arr);
	}
}
