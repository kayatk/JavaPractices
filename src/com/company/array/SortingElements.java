package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.println("Enter the number of elements to sort: ");
        int size = scanner.nextInt();

        // Input elements
        int[] numbers = new int[size];
        System.out.println("Enter the elements to sort: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array without the built in method
        bubbleSort(numbers);

        //sort using built in Method
        Arrays.sort(numbers);
    

        // Print sorted array
        System.out.println("Sorted numbers:");
       /*  for (int number : numbers) {
            System.out.print(number + " ");
        }*/
        System.out.println(Arrays.toString(numbers));

        // Close the scanner
        scanner.close();
    }

    // Bubble sort implementation
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}