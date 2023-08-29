package com.company;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeNumberIdentification {
    public static void main(String args[]){
        System.out.println("Enter number to check");
        Scanner sc = new Scanner(System.in);
        String number= sc.nextLine();
        StringBuffer str= new StringBuffer(number);
        String reverse = String.valueOf(str.reverse());
        System.out.println(reverse);
        String result = (reverse.equals(number))?"Palindrom number":"Not a Palindrom number";

        System.out.println(result);

        }
    }

