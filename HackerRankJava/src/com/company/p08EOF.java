package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p08EOF {
    public static void main(String[] arg) throws FileNotFoundException {
        File inFile = new File("C:\\Users\\Ngoc Pham\\Desktop\\EOF.txt");
        Scanner scan = new Scanner(inFile);
        for (int i=1; scan.hasNext(); i++){
            System.out.println(i + " " + scan.nextLine());
        }
    }
}


//Output is:
//1 Hello world
//2 I am a file
//3 Read me until end-of-file.