package Chapter8;

public class Ch08_01 {

	public static void main(String[] args) {
		int i,j,tmp;
		int data[]={6,5,9,7,2,8};
		System.out.println("ð������");
		System.out.println("ԭʼ����Ϊ��");
		for(i=0;i<6;i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		for(i=5;i>0;i--){
			for (j=0;j<i;j++){
				if(data[j]>data[j+1]){
					tmp=data[j];
					data[j]=data[i];
					data[i]=tmp;
				}
			}
			System.out.print("��"+(6-i)+"�������Ľ���ǣ�");
			for(j=0;j<6;i++){
				System.out.print(data[j]+" ");
			} 
			System.out.println();
		}
		System.out.println("�����Ľ��Ϊ�� ");
		for(i=0;i<6;i++){
			System.out.print(data[i]);
		}
		System.out.println();
		
		

	}

}
