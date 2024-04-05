 package com.company;

import java.util.Scanner;

public class ReversecharOnWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentance you want to reversse on each word");
        String sentance = sc.nextLine();
        String words[] = sentance.split(" ");
        for (String word : words) {
            wordreverse(word);
        }
        
    }

   public static void wordreverse(String x){
      char ar [] =new char[x.length()];
      ar=x.toCharArray();
      for(int i= (ar.length-1);i>=0;i--){
            System.out.print(ar[i]);
      }
      System.out.print(" ");
    }
    
}