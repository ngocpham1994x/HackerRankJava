package com.company;

import java.util.*;

public class p05Loops {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int result;
        if (2<=N && N<=20) {
            for (int i = 1; i <= 10; i++) {
                result = N * i;
                System.out.printf("%d x %d = %d%n", N, i, result);
            }
        }
    }
}
