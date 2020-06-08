package Chapter0;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class TestWordArrange {
    
    public static void main ( String [] args){
         Scanner o=new Scanner(System.in);
         int paragrapgh=o.nextInt();
         List<String> input= new ArrayList<String>();
        String temp=" ";
        while (!temp.equals("")){
             Scanner p=new Scanner(System.in);
            temp=p.nextLine();
            input.add(temp);
        }
         WordArrange a =new WordArrange(input,paragrapgh);
        a.printThesis();
    }
}