package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String word =sc.nextLine();

        for (int i=(word.length()-1);i>=0;i--){
            System.out.print(word.charAt(i));
        }


        //Method2- Character array

        char[] rev =word.toCharArray();
        for (int i=rev.length-1;i>=0;i--){
            System.out.print(rev[i]);
        }

        StringBuffer str =new StringBuffer(word);
        System.out.print(str.reverse());

    }
}
