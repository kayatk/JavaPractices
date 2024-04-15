package com.company.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
    //Declaring Array with 5 Integer Value.
        int []array ={5,4,7,10,87};

    //Get the value from user to search 
        System.out.println("Enter the element to search: ");
        Scanner scanner = new Scanner(System.in);
        int element =scanner.nextInt();
        searching(element,array);

    

    }

    //Method to find the Element
        public static void searching(int element,int []arr){
            for (int i : arr) {
                if(i==element){
                    System.out.println("Element is there");  
                    break; 
                }
            }
           
        } 
}
