package com.company;

import java.util.Scanner;

/**
 * Created by Pavilion on 3/15/2016.
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("a=");
        int a = Integer.parseInt(console.nextLine());
        System.out.print("b=");
        float b = Float.parseFloat(console.nextLine());
        System.out.print("c=");
        float c = Float.parseFloat(console.nextLine());
        String binary = String.format("%10s",Integer.toBinaryString(a));
        System.out.printf("|%-10x|%s|%10.2f|%-10.3f|", a, binary.replace(" ", "0"), b, c);
    }
}
