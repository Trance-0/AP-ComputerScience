package Chapter0;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class TestWordArrange {
    
    public static void main ( String [] args){
        Scanner p=new Scanner(System.in);
        String temp=p.nextLine();
        WordArrange a=new WordArrange();
        a.printParagraph(temp);
    }
}