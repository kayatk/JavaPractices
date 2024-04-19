package com.company;

public class ArraysAssignment {
    public static void main(String [] args){
        /* 
 * complete this program to check whether 786 is present in given array.
	if found print - number found
	if not found - print number is not present in given array

*/
            int number = 786;
            boolean flag = false;

            int arr[] = new int[10]; 
            arr[0] = 15;
            arr[1] = 85;
            arr[2] = 55;
            arr[3] = 125;
            arr[4] = 777;
            arr[5] = 999;
            arr[6] = 786;
            arr[7] = 2233;
            
     for(int i:arr){
        if(i==number){
            System.out.println("Number found");
            flag=true;
            break;
        }
     }
        if(flag=false){
            System.out.println("Number is not present in given array");
        }
    }

    }
   
