package com.company;

import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String [] args){
        String arr[]={"Java","2","34","Python"};
        System.out.println("Enter the no to search");
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();

        for(String ser : arr){
            if(ser.equalsIgnoreCase(word)){
                System.out.println("Found");
            }
        }
    }
}
