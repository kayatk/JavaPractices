package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Method 01
     /*   System.out.print("Enter a Number: ");
        String number =sc.nextLine();
        int y= number.length() -1;
        for(int i=y;i>=0;i--){
            System.out.print(number.charAt(i));
        }*/

        //Method 02
      /*  System.out.print("Enter a Number: ");
        int rNum =sc.nextInt();
         int r=1;
         while(rNum!=0) {
             r = rNum % 10;
             rNum =rNum/10;
             System.out.print(r);
         }*/

        //Method 03
        System.out.print("Enter a Number: ");
        String s =sc.nextLine();
        StringBuffer sb =new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
