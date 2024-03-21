package com.company.TextOnFiles;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamwrite{

    public static void main(String args[])throws IOException{
        
        String content = "This is the content of the file output stream";
        byte[] strToBytes = content.getBytes();
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/kaya/Documents/JavaPractices/src/com/company/TextOnFiles/file2.txt");
        fileOutputStream.write(strToBytes);
        fileOutputStream.close();

    }
}