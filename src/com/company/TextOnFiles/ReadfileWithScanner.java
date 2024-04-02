package com.company.TextOnFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadfileWithScanner {
    
    public static void main(String []args) throws FileNotFoundException{
        File file = new File("src/com/company/TextOnFiles/file1.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
            
        }

      //  sc.useDelimiter("\\Z");
      //  sc.nextLine();
    }
}
