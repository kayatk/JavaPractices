package com.company;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance which needs to be reversed");
        String x = sc.nextLine();

        String words []=x.split(" ");
    
        for(int i=(words.length-1);i>=0;i--){
            System.out.print(words[i]);
        }

        
    }
}
