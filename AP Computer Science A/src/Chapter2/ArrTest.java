package Chapter2;

public class ArrTest {
public static int countEven(int[] arr1) {
	//int[] arr1=arr
	int count=0;
	for (int num : arr1)
		if (num % 2 ==0)//num is even
			count++;
	return count;
}

public static void main(String[] args) {
	int[] arr= {0,1,2,3,4,5,6};
	countEven(arr);
  }
}
