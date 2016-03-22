package com.company;

import java.util.Scanner;

/**
 * Created by Pavilion on 3/16/2016.
 */
public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char [] input =console.nextLine().toCharArray();
        int base=7;
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            String digit = Character.toString(input[i]);
            double temp =Integer.parseInt(digit)*Math.pow(base,input.length-1-i);
            result+=temp;
        }
        System.out.println(result);

    }
}
