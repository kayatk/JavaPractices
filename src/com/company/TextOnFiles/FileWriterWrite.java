package com.company.TextOnFiles;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterWrite {
    public static void main(String[] args) throws IOException{
        
        String content = "writing on the file using the method write of the class FileWriter e";
        String filePath = "/Users/kaya/Documents/JavaPractices/src/com/company/TextOnFiles/file2.txt";
        FileWriter fileWriterobj = new FileWriter(filePath);
        fileWriterobj.write(content);
        fileWriterobj.close();
        System.out.println("Data has been written successfully !");

    }
}
