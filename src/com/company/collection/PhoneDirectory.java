package com.company.collection;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cont;
        HashMap<String,String> contacts =new HashMap<>();

      do{
        System.out.println("Enter Add/Remove/Search/display: ");
        String input =scanner.nextLine().toLowerCase();
        
    
        switch (input){
        case "add":
        addContact(scanner,contacts);
        break;

        case "remove" :
        removeContact(scanner,contacts);
        break;

        case "search" :
        searchContact(scanner,contacts);
        break;

        case "display" :
        displayAllContacts(contacts);
        break;
        
        default:
        System.out.println("you entered a invalid input");
        }
        System.out.println("Do you want to continue? yes/no");
                cont =scanner.nextLine().toLowerCase();
                if (cont.equals("no")) {
                    System.out.println("Thank you !");
                }
        }while (cont.equals("yes"));
    }

   

    public static void addContact(Scanner sc,HashMap<String,String> contact){
        System.out.println("Enter the name: ");
        String name= sc.nextLine().toLowerCase();
        if (contact.containsKey(name)) {
            System.out.println("Contact already there in the Phone directory");
        }
        else{
        System.out.println("Enter the number: ");
        String number= sc.nextLine();
        contact.put(name,number);
        System.out.println("Contact Added Successfully");
        }
    }

    public static void removeContact(Scanner sc,HashMap<String,String> contact){
        System.out.println("Enter the Name");
        String name= sc.nextLine().toLowerCase();
        if (contact.containsKey(name)) {
            contact.remove(name);
            System.out.println("Contact removed Successfully");
        }
        else{
            System.out.println("Name not found in the contacts");
        }      
    }

    public static void searchContact(Scanner sc,HashMap<String,String> contact){
        System.out.println("Enter the Name to search");
        String name= sc.nextLine().toLowerCase();
        if (contact.containsKey(name)) {
            System.out.println("Name: " +name+"\n Number: "+contact.get(name));
        }
        else{
            System.out.println("Name not found in the contacts");
        }      
    }

    public static void displayAllContacts(HashMap<String,String> contact){
       if(contact.isEmpty()){
        System.out.println("You dont have any contacts in the Phone Directory");
       }
       else{
        System.out.println(contact);
       }
         
    }
}
