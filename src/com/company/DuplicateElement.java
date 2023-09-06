package com.company;

import java.util.Scanner;

public class DuplicateElement {

    public static void main(String []args){
        System.out.println("Enter 5 number to find duplicate values");
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int y=i+1;y<arr.length;y++)
            {
                if(arr[i]==arr[y]){
                    System.out.println(arr[i]);
                }
            }

        }
    }
}
