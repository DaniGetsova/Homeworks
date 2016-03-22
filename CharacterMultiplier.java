package com.company;

import java.util.Scanner;

/**
 * Created by Pavilion on 3/16/2016.
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String [] input = console.nextLine().split(" ");
        String first = input[0];
        String second = input[1];
        int max = first.length()>second.length()?first.length():second.length();
        char [] longer = first.length()>second.length()?first.toCharArray():second.toCharArray();
        char [] shorter = first.length()<second.length()?first.toCharArray():second.toCharArray();
        int result = 0;
        for (int i = 0; i <max ; i++) {
            if(i<shorter.length) {
                result+=shorter[i]*longer[i];
            }
            else {
                result+=longer[i];
            }
        }
        System.out.println(result);
    }
}
