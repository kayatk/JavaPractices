package com.company;

import java.util.Scanner;

public class NumberCount {
    public static void  main(String []args){
        System.out.println("Enter the Number: ");
        Scanner sc =new Scanner(System.in);
        //Method #1
      /*  String Number=sc.nextLine();
        System.out.println(Number.length());*/

        //Method #2
        int i=0;
        int number=sc.nextInt();
        while(number>0){
            number=number/10;
            i++;
        }
        System.out.println(i);

    }
}
