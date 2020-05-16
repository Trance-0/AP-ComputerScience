package Exam_2020;

/*检查步骤:
/1,检查return值,别写错了.
/2,检查循环,每一轮将变量的变化写出.
/3,审题,审题,审题.
/4,最后记得将例子带入检查.
/5,题目的方法没说要用就不要用,如果题目比较难再用.
*/

//从下面开始复制,记得最后的时候把AP ID的注释去掉.

// 14859YVW
// ZW

//import java.util.List;
//import java.util.ArrayList;

public class  TargetInteger {
    // private String;
    // private int;
    // private int[];
    // private String[];

    // public (){

    // }


    14859YVW
    ZW

    (a)
    public static boolean runSimulation (int sampleSize){
        int[] sample=new int[sampleSize];
        int positiveTargetNum1=0;
        int positiveTargetNum2=0;
        for (int i=0;i<sampleSize;i++){
            sample[i]=getInt();
        }
        for (int j=0;j<sampleSize;j++){
            int temp=sample[j];
            if (isTarget(temp)&&j<sampleSize/2){
                positiveTargetNum1++;
            }
            if (isTarget(temp)&&j>sampleSize/2){
                positiveTargetNum2++;
            }
        }
        return positiveTargetNum1>positiveTargetNum2;
    }
    

    (b)
    1,make an private int[] sample,and create a void method createSample(int size)
    public void createSample(int size){}
    2,use for loop to create int[] sample and give each of them with value getInt();
 
    // public static void main (String [] args ){

    // }
}