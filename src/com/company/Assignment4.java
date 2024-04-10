package com.company;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        System.out.println("Enter the Marks: ");
        Scanner sc = new Scanner(System.in);
        double marks= sc.nextDouble();
        if(marks<33.3){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }
}
