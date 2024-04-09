package com.company;

import java.util.Scanner;

public class RemoveJunkcharacters {
    public static void main(String [] args){
        System.out.println("enter sentance which need to be without junk/Special characters: ");
        Scanner sc = new Scanner(System.in);
        String t=sc.nextLine();
        
       System.out.println(t.replaceAll("[^A-Za-z0-9]", "")); 
    }
}
