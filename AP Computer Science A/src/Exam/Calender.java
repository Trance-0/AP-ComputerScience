package Exam;

public class Calender {
    private Date date;
    private String[] dayList = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
    private String[] CalenderList = {"Sun ","Mon ", "Tue ", "Wed ", "Thu ", "Fri ", "Sat "};

    public Calender(Date a) {
        date = a;
    }

    public int getDay(Date a, Date b) {
        int sum = 0;
        while (!a.isEquals(b)) {
            a.changeDay();
            sum++;
        }
        return sum;
    }

    public String getWeek() {
        return dayList[getDay(new Date(1, 1, 1), date) % 7];
    }

    public int dayOfMonth(){
        if(date.getMonth()==1||date.getMonth()==3||date.getMonth()==5||date.getMonth()==7||date.getMonth()==8||date.getMonth()==10||date.getMonth()==12){
            return 31;
        }else if (date.getMonth()==2){
            if (date.isLeafYear()){
                return 29;
            }else{
                return 28;
            }
        }else{
            return 30;
        }
    }

    public void printMonth(){
        System.out.println("           "+date.getYear()+"."+date.getMonth()+"           ");
        for (String k:CalenderList){
            System.out.print(k);
        }
        System.out.println();
        int blanks=getDay(new Date(1, 1, 1), date) % 7;
        for (int i=0;i<blanks;i++){
            System.out.print("    ")
;        }
        for (int j=1;j<dayOfMonth()+1;j++){
            if(j<10){
                System.out.print(" "+j+"  ");
            }else{
                System.out.print(" "+j+" ");
            }
            if ((j+blanks)%7==0){
                System.out.println();
            }
        }
    }

}