package com.company.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    
    public static void main(String[] args) {

        int noArray[] = {3,65,89,100,43,56,33,76,2,55};
        
    //sort the Array
            Arrays.sort(noArray);

    //Get Element from user to enter a value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value to find: ");
        int element = scanner.nextInt();

    //Approach #1
    //By Writing logic manually
    //define lower and Higher value
        int low= 0;
        int high=(noArray.length)-1;
        boolean flag =false;

        while (low <= high) {
            int mid=(low+high)/2;
            if(noArray[mid]==element){
                System.out.println("Element Found..");
                flag=true;
                break;
            }
            else if(noArray[mid]<element){
                low= mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        if(flag==false){
            System.out.println("Element Not Found");
        }

    //Approach #2 with built in method

     int index= Arrays.binarySearch(noArray, element);
     if(index<0){
       System.out.println("Element Not found"); 
     }
     else{
        System.out.println("Element Found ..");
     }
    }
}
