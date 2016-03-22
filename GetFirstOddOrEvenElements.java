package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String [] input = console.nextLine().split(" ");
        System.out.print("Get ");
        String [] command = console.nextLine().split(" ");
        int limit = Integer.parseInt(command[0]);
        String word = command[1];
        int counter = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if(counter<limit){
                if(word.equals("odd")){
                    if(Integer.parseInt(input[i])%2!=0){
                        result.add(counter,input[i]);
                        counter++;
                    }
                }
                else {
                    if(Integer.parseInt(input[i])%2==0){
                        result.add(counter,input[i]);
                        counter++;
                    }
                }
            }
        }
        for (String s : result) {
            System.out.print(s+" ");
        }
    }

}
