package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Pavilion on 3/16/2016.
 */
public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = Integer.parseInt(console.nextLine());
        int M = Integer.parseInt(console.nextLine());
        int max = N>M?N:M;
        int min = N<M?N:M;
        Random rn = new Random();
        int range = (max-min)+1;
        ArrayList <Integer> result = new ArrayList<>();
        int counter = 0;
        while(counter<range) {
            int index = counter;
            int randomNum =  rn.nextInt(range) + min;
            if (!result.contains(randomNum)) {
                result.add(index, randomNum);
                counter++;
            }
        }
        for (int i = 0; i < range; i++) {
            System.out.printf("%d ", result.get(i));
        }
    }
}
