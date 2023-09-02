package com.company;

import java.util.Scanner;

public class ArraySum {
    public static void main(String args[]){
        System.out.println("Enter the numbers to get sum: ");
        int[] arr=new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
        }
        for(int i:arr)
            sum=sum+i;
        System.out.println("Sum of entered Number: "+sum);
    }
}
