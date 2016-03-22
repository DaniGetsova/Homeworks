package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pavilion on 3/16/2016.
 */
public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Pattern pattern = Pattern.compile("\\b([A-Z]+[a-zA-Z]*[A-Z]+)\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.printf("%s ",matcher.group() );
        }

    }
}
