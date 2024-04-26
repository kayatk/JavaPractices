package com.company.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryListManager {
    public static void main(String[] args) {
        /*Create a Java program to manage a grocery list using the List interface. Your program should allow users to perform the following operations:

            Add items to the grocery list.
            Remove items from the grocery list.
            View the current items in the grocery list.
            Clear the entire grocery list.
            Ensure that your program handles user input gracefully and provides clear prompts and feedback. */

        List<String> groceryList = new ArrayList<String>();
        
        String again;
        do{
        System.out.println("what you want to do in the list Add/Remove/view/clear? ");
        Scanner scanner =new Scanner(System.in);
        String action= scanner.nextLine().toLowerCase();
        switch (action) {
            case "add":
                add(scanner,groceryList);
                break;
            case "remove":
                remove(scanner,groceryList);
                break;
                
            case "view":
               view(groceryList);
                break;
            case "clear":
                clears(groceryList);
            break;
            default:
                System.out.println("Please Enter the action you want to make as given... ");
                break;
        }
        System.out.println("Do you want to continue? yes/no");
                again =scanner.nextLine();
                if (again.toLowerCase().equals("no")) {
                    System.out.println("Thank you !");
                }
        }while(again.toLowerCase().equals("yes"));
    }

    public static void add(Scanner scanner, List<String> groceryList){
                System.out.println("Enter the grocery to add");
                String item =scanner.nextLine().toLowerCase();
                groceryList.add(item);
                if (groceryList.contains(item)) {
                    System.out.println(item+ " has been added to your grocery list");
                }
    }

    public static void remove(Scanner scanner, List<String> groceryList){
        System.out.println("Enter the grocery to remove");
        String item =scanner.nextLine().toLowerCase();
        groceryList.remove(item);
        if(!groceryList.contains(item)){
            System.out.println(item+ " has been removed from your grocery list");
        }
    }
    public static void clears(List<String> groceryList){
        if(groceryList.isEmpty()){
            System.out.println(" You dont have any item to clear");
        }
        else{
            groceryList.clear();
            if(groceryList.isEmpty()){
                System.out.println("Your GroceryList is cleared");
            }
            else{
                System.out.println("Unable to clear the list. Try again !");
            }
        }
    }
    public static void view(List<String> groceryList){
        if(groceryList.isEmpty()){
            System.out.println(" Your Grocery list is empty");
        }
        else{
            System.out.println(groceryList);
        }
    }
}
