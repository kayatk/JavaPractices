package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        System.out.println("Enter the fibonacci number:");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int num1=0,num2=1;
        int sum=0;

        if(num==1){
            System.out.println(num1);;
        }
        else if(num==2){
            System.out.println(num2);;
        }
        else{
            for(int i=2;i<num;i++){
                sum=num1+num2;
                num1=num2;
                num2=sum;
            }
            System.out.println(sum);
        }


    }
}
