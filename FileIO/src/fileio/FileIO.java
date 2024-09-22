package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Scanner;

public class FileIO 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a file or a folder path");
        String pathStr = sc.nextLine();
       
        Path filePath = Paths.get(pathStr);
        if(Files.exists(filePath))
        {
           System.out.println(filePath.getFileName() + "exists");
           System.out.println("is directory: " + Files.isDirectory(filePath));
           System.out.println("Last modified: " + Files.getLastModifiedTime(filePath));
           System.out.println("Size " + Files.size(filePath));
        }
        else 
            System.out.println("Path does not exist");
    }
    
}

