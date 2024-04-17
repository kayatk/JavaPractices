package com.company.array;


public class FindDuplicates{
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 2, 4, 5, 7, 8};

        for (int i = 0; i < a.length - 1; i++) {
            for (int y = i + 1; y < a.length; y++) {
                if (a[i] == a[y]) {
                    System.out.print(a[i] + " ");
                    break; // Exit the inner loop once a duplicate is found
                }
            }
        }
    }
}