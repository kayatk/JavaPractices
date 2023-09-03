package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoArray {
    public static void main(String args[]){

        System.out.println("Enter your first Array");
        Scanner sc= new Scanner(System.in);
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        for(int i=0;i<5;i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter your second Array");
        for(int i=0;i<5;i++){
            arr2[i]= sc.nextInt();
        }
        //Method #1

        for(int i=0;i<arr1.length;i++){
          if(arr1[i]!=arr2[i]) {
              System.out.println("Both Arrays are not Same");
              break;
          }
          else
              System.out.println("Both Arrays are Same");
        }

        //Method#2
        boolean status =Arrays.equals(arr2,arr1);
        if( status==true){
            System.out.println("Both Arrays are Same");
        }
        else
        System.out.println("Both Arrays are not Same");
    }
}
