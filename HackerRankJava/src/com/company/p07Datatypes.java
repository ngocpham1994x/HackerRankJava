package com.company;

import java.util.Scanner;

public class p07Datatypes {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-Math.pow(2,15) && x<=(Math.pow(2,15)-1))System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-Math.pow(2,63) && x<=(Math.pow(2,63)-1))System.out.println("* long");  //9223372036854775808l
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
