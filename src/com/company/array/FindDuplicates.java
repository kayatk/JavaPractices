package com.company.array;

import java.util.HashSet;

public class FindDuplicates{
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 2, 4, 5, 7, 8};

        for (int i = 0; i < a.length - 1; i++) {
            for (int y = i + 1; y < a.length; y++) {
                if (a[i] == a[y]) {
                    System.out.print(a[i] + " ");
                   // System.out.println("Duplicate element found" +a[i]);
                    break; 
                }
            }
        }

        //using Hash Set 
        HashSet <Integer> hash = new HashSet();
        boolean flag =false;
        for (int i : a) {
            if(hash.add(i)==false){
                System.out.println("Duplicate element found: " +i);
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("No Duplicates element found");
        }
    }
}