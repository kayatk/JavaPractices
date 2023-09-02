package com.company;

import java.util.Scanner;

public class FindOddEvenArray {
    public static void main(String args[]){
        System.out.println("Enter numbers: ");
        Scanner sc = new Scanner(System.in);
        int []arr= new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            if(i%2==0)
                System.out.println(i+" is a Even number");
            else
                System.out.println(i+" is a Odd number");

        }

    }
}
