package com.company;


import java.util.Scanner;

public class OddEvenNumberCount {
    public static void main(String []args){
        System.out.println("Enter Number");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int odd=0,even=0;

        while(num>0){

            if((num%10)%2==1){
                odd++;
            }
            else {
                even++;
            }
            num=  num/10;
        }
        System.out.println("Even number: "+even);
        System.out.println("Odd number count: "+odd);
    }
}
