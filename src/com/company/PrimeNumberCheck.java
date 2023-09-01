package com.company;


import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String args[]){
        System.out.println("Enter a number to check");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if (number>1){
            for(int i=2;i<=number;i++){
                if(number%i==0){
                    System.out.println(" Not Prime number");
                    break;
                }
                else{
                    System.out.println("Prime number");
                    break;
                }
            }
        }
        else{
            System.out.println("Not a Prime number");
        }
    }

}
