package com.company;

import java.util.Scanner;

public class p11InttoString {
    public static Scanner input = new Scanner(System.in);
    public static int n = input.nextInt();
    public static void main(String[] arg){
        //System.out.printf("%d",n);
        //String s = String.valueOf(n);
        //String s = "" + n;
        //OR:
        String s = Integer.toString(n);
        System.out.println("The string is: " + s);
    }
}
