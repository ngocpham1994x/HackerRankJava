package com.company;

import java.util.*;

public class p06LoopsII {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i=0;i<q;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();  //number of terms
            int recur = a;
            if ((0<=q && q<=500) && (0<=a && a<=50) && (0<=b && b<=50) && (1<=n && n<=15)) {
                for (int j = 0; j < n; j++) {
                    recur += Math.pow(2, j) * b;
                    System.out.printf("%d ", recur);
                }
            }
            System.out.println();
        }
    }
}

//