 package com.company;

import java.util.Scanner;

class CountWordsInString {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence to count the word in the String");
       String sentance= sc.nextLine();
       String arr[] =sentance.split(" ");
       System.out.println("Number of Words in the sentance is " +arr.length);

    }
}