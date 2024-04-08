package com.company;

import java.util.Scanner;

public class CharacterOccurance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentance to find the occurance count:");
        String words=sc.nextLine();
        System.out.println("Enter the character to count:");
        String c=sc.nextLine();
        char ch = c.charAt(0);
       char[] characters= words.toCharArray();
       int count=0;
       for(char charray : characters){
            if(charray == ch){
                count++;
            }
       }
       if(count ==0 )
       {
        System.out.println("entered character is not in the sentance");
       }
       else{System.out.println("The"+ch+"in the entered sentance is "+count);}
       
    }
}
