package com.company.TextOnFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilebufferedWriterWrite {
    public static void main(String args[]) throws IOException{

        String content = "xyz";
        BufferedWriter bufferedWriterobj = new BufferedWriter(new FileWriter("/Users/kaya/Documents/JavaPractices/src/com/company/TextOnFiles/file2.txt"));
        bufferedWriterobj.write(content);
        bufferedWriterobj.close();
        System.out.println("Successfully written");
        
    }
}
