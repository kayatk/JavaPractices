package com.company.TextOnFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter{
    public static void main(String[] args) throws IOException {
        
       Path file1Path = Path.of("/Users/kaya/Documents/JavaPractices/src/com/company/TextOnFiles/file1.txt");
       Path file2Path = Path.of("/Users/kaya/Documents/JavaPractices/src/com/company/TextOnFiles/file2.txt");

       //using readString to read the File content
       String file2Content = Files.readString(file1Path);

       //writeString used ro write the content to the file
       Files.writeString(file2Path, file2Content);
       System.out.println(Files.readString(file2Path));
    }
}