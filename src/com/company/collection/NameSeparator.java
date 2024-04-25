package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NameSeparator{

    public static void main(String[] args) {
        
    /*

You are tasked with creating a Java program to separate student names based on whether they contain vowels.
 The initial list of student names includes: Mukesh, Mahesh, Suresh, Naresh, Kamlesh, and Umesh. 
 Your program should identify names that contain vowels and store them separately.
Finally, it should print both the original list of names and the list of names containing vowels.
Your program should adhere to the following specifications:

Initialize an array or list with the following student names: Glyn, Sky, Mukesh, Selenium, Jenkins, and Brynn.
Implement a method to check if a given name contains any vowels (a, e, i, o, u).
If a name contains vowels, store it in a separate list.

Print both the original list of names and the list of names containing vowels.
Feel free to extend the program with additional features or functionalities as you see fit. */

List<String> namesWithVowels =new ArrayList<String>();
List<Character> vowels =Arrays.asList('a','e','i','o','u');
List<String> names=Arrays.asList("Glyn","Sky", "Mukesh", "Selenium", "Jenkins","Brynn");

Iterator<String> nameIterator= names.iterator();

    while(nameIterator.hasNext()){
      String name = nameIterator.next();
      char[] letters=name.toCharArray();
     // boolean flag =false;
      for (char c : letters) {
        if(vowels.contains(Character.toLowerCase(c))){
            namesWithVowels.add(name);
            break;
        }
      }
      
    }
    System.out.println("Original name list is:" + names);
    System.out.println("Names with Vowels list is:" + namesWithVowels);
    }
    
}
