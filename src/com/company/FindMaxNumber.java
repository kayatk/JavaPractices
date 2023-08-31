package com.company;

import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String [] args){

        int []num =new int[3];
        Scanner sc = new Scanner(System.in);
        int max=0;
        for (int i=0;i<num.length;i++){
            System.out.println("Enter number");
            num[i]=sc.nextInt();
        }
        for (int i=0;i<num.length;i++){
            if(max<=num[i]){
                max =num[i];
            }
        }
        System.out.println("maximum Number is:" +max);
    }
}
