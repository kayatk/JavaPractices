package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Enter the 5 Elements to find the maximum");
        Scanner scanner = new Scanner(System.in);
        int elements[]=new int[5];
        for(int i=0;i<5;i++){
             elements[i]=scanner.nextInt();
        }
        // Approach#1
                //Maximum
                int max =0;
                for(int y=0;y<5;y++){
                    if (max<=elements[y]){
                        max=elements[y];
                    }
                }
                System.out.println("Maximum of the element is "+max);

                //Minimum
                int min=1000;
                for(int y=0;y<4;y++){
                    if (min>elements[y]){
                        min=elements[y];
                    }
                }
                System.out.println("Minimum of the element is "+min);

       /*   //Approach #2
                    Arrays.sort(elements);
                    System.out.println("Minimum :" +elements[0]);
                    System.out.println("Maximum :" +elements[elements.length-1]);
*/

        //Approach #3
                int temp;
                for(int i=0;i<4;i++){
                    if(elements[i]<elements[i+1]){
                        temp=elements[i];
                        elements[i]=elements[i+1];
                        elements[i+1]=temp;
                    }
                }
                System.out.println("Minimum of the element is "+elements[0]);
                System.out.println("Maximum of the element is "+elements[elements.length-1]);
         scanner.close();
    }
   
}
