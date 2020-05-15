package Exam;

public class StudentRecord {
    private int [] scores;

    private double avarage(int first,int last){
        double sum=0;
        for (int i =first;i<=last;i++){
            sum+=scores[first];
        }
        return sum/(last-first+1);
    }
    public boolean hasImproved(){
        for (int i=1;i<scores.length;i++){
            if (scores[i-1]>scores[i]){
                return false;
            }
        }
        return true;
    }
    public double finalAverage(){
        if (hasImproved()){
            return avarage(scores.length/2,scores.length-1);
        }
        return avarage(0,scores.length-1);
    }

}