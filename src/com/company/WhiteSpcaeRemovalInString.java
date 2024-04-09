package com.company;

import java.util.Scanner;

public class WhiteSpcaeRemovalInString {
    public static void main(String args[]){
        System.out.println("Enter the sentance needs to be space removed: ");
        Scanner scan = new Scanner(System.in);
        String s =scan.nextLine();
        System.out.println(s.replace(" ", ""));
    }
}
