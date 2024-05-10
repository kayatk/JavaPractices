package com.company.collection;

import java.util.HashMap;
import java.util.Scanner;


public class WordsCountCollection {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Paragraph");
        String para =scanner.nextLine().toLowerCase();
        HashMap<String,Integer> words= new HashMap<>();
        String paraWords[]=para.split("\\s+");
        int count=0;
        for (String word : paraWords) {
            if(words.containsKey(word)){
                words.put(word,words.get(word)+1);
            }
            else{
                words.put(word,1);
            }
 
        }    
        System.out.println(words);
    }
 
}
