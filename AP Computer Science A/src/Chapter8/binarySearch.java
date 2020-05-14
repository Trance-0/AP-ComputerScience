package Chapter8;

public class binarySearch {
	
	public static int binSearchHelp(int[] arr,int key,int low,int high){
		int mid;
		if(low>high){
			return -1;		//没有找到
		}else{
			mid=(low+high)/2;
			if(key==arr[mid])
				return mid;		//找到了
			else if(key<arr[mid])
				return binSearchHelp(arr,key,low,mid-1);
			else
				return binSearchHelp(arr,key,mid+1,high);
		}				
	}
	public static int binSearch(int[] arr,int key){
		return binSearchHelp(arr,key,0,arr.length-1);
	}	
	public static int binarySearch1(int[] element,int target){
		int left=0;
		int right=element.length-1;
		while(left<=right){
			int middle=(left+right)/2;
			if(target<element[middle]){
				right=middle-1;
			}
			else if(target>element[middle]){
				left=middle+1;
			}
			else{
				return middle;
			}
		}
		return -1;
	}	
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8};
		System.out.println(binarySearch1(arr,5));
	}
}
