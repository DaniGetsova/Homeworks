package com.company;

import java.util.Scanner;

/**
 * Created by Pavilion on 3/16/2016.
 */
public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int decimal = Integer.parseInt(console.nextLine());
        StringBuilder result = new StringBuilder();
        int base = 7;
        int quotient = 1;

        while(quotient!=0) {
            quotient=decimal/base;
            int reminder = decimal%base;
            result.insert(0,reminder);
            decimal=quotient;
        }
        System.out.println(result.toString());
    }
}
