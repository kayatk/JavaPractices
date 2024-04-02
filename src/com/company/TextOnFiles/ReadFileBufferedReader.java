package com.company.TextOnFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferedReader{

    public static void main(String args[])throws IOException{

        File f = new File ("src/com/company/TextOnFiles/file1.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String st;
        while ((st = br.readLine())!= null) {
            System.out.println(st);
        }
    }
}