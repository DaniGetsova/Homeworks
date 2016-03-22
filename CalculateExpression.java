package com.company;

import java.util.Scanner;

/**
 * Created by Pavilion on 3/16/2016.
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("a=");
        double a = Double.parseDouble(console.nextLine());
        System.out.print("b=");
        double b = Double.parseDouble(console.nextLine());
        System.out.print("c=");
        double c = Double.parseDouble(console.nextLine());
        double f1 = Math.pow((Math.pow(a,2)+Math.pow(b,2))/((Math.pow(a,2)-Math.pow(b,2))),(a+b+c)/Math.sqrt(c));
        double f2 = Math.pow((Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 3)), (a-b));
        double difference = Math.abs((a+b+c)/3-(f1+f2)/2);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, difference);
    }

}
