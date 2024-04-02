package com.company.TextOnFiles;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileReader{

    public static void main(String args[]) throws IOException{
        FileReader fr = new FileReader("src/com/company/TextOnFiles/file2.txt");
        
        int i;
        while ((i=fr.read())!= -1) {
            System.out.print((char)i);
        }
        
    }
}