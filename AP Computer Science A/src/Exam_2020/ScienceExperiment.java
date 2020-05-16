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
import java.util.ArrayList;

public class  ScienceExperiment {
   private ArrayList<Trial> trialList;
    // private int;
    // private int[];
    // private String[];

    // public (){

    // }
    14859YVW
    Z.W.

    (a)
    public double getCompoundAvg (String comp){
        double sumTemp=0;
        int times=0;
        for(Trial i :trialList){
            if (i.getCompound().equals(comp)){
                sumTemp+=i.getTemp();
                times++;
            }
        }
        if (times!=0){
            return sumTemp/times;
        }
    return -1.0;
    }
    
    (b)
    public double getCompoundWithHighestAvg (){
        ArrayList temp=getCompoundList();
        double highestTemp=getCompoundAvg(temp.get(0));
        for (String i :temp){
            if(getCompoundAvg(i)>highestTemp){
                highestTemp=getCompoundAvg(i);
            }
        }
        return highestTemp;
    }

    (c)
    public double getCompoundAmountUsed(){}

    1,set a new private double variable to represent the amount of the trial
    2,set to add a new method in trial to return the amount of the trial
    3, in getCompoundAmountUsed, set a variable double sum and use for loop to add every trial.getAmount();
    4,return the sum;
    // public static void main (String [] args ){

    // }
}