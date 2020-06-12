package Chapter0;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WordArrange {
    private int wordLimit=100;
    private  int[]historymap={0};
    private int pointer=0;

    public int backToPreviousPointer(){
        return historymap[historymap.length-2];
    }

    public int renewPointer(String waitingToCut){
         String temp=waitingToCut.substring(pointer);
        pointer=temp.indexOf(" ")+pointer;
        if (pointer>wordLimit){
            return backToPreviousPointer();
        }
        return renewPointer(temp);
    }

    public  String replaceString( String org, String rep){
         String result="";
        return result;
    }


    public void printParagraph(String paragraph){
        String waitingToCut=paragraph;
        while(waitingToCut.length()>100){
             int newPointer= renewPointer(waitingToCut);
            System.out.println(waitingToCut.substring(0,newPointer));
            waitingToCut=waitingToCut.substring(newPointer);
        }
        System.out.println(waitingToCut);
    }

    public void printThesis(List <String> thesis){
        for (String paraghragh:thesis){
            printParagraph(paraghragh);
        }
    }

}