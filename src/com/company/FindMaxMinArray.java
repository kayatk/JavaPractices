package com.company;

import java.util.Scanner;

public class FindMaxMinArray {
    public static void main(String args[]){
        System.out.println("Enter 5 numbers");
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];

        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0];
        for (int i=0;i<5;i++){

          if(min>arr[i])  {

              min=arr[i];
          }
          if(max<arr[i]){
              max=arr[i];
          }
        }


        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);

    }
}

