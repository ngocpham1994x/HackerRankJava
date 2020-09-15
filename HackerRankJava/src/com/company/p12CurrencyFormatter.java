package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p12CurrencyFormatter {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();


            NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            String us = usFormat.format(payment);
            String india = indiaFormat.format(payment);
            String china = chinaFormat.format(payment);
            String france = franceFormat.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);

            //System.out.println(usFormat);

            //NumberFormat test = NumberFormat.getInstance(Locale.CANADA);
            //System.out.println(test);
        }
}
