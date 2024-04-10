package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class Decendingsort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Size of the Array
        System.out.println("Enter the number of elements to sort: ");
        int size =scanner.nextInt();

        //Store the elements
        int []array = new int[size];
        System.out.println("Enter the elements: ");
        for(int n=0;n<size;n++){
            array[n]=scanner.nextInt();
        }

        //Sort the Array using sort then we need to use Integer 
        //Arrays.sort(array,Collections.reverseOrder());

        //sort the Array using bubble sort
        reverseOrderMethod(array);

        //print sorted array
        System.out.println("Decending order Array:");
        System.out.println(Arrays.toString(array));
    }

   public static void reverseOrderMethod(int[] x){
        int replace;
        for(int n=0;n<x.length;n++){
            for (int y=0;y<x.length-1;y++){
                if(x[y]<x[y+1]){
                    replace=x[y];
                    x[y]=x[y+1];
                    x[y+1]=replace;
                }
            }
        }
     }
     


}
