package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Pattern pattern = Pattern.compile("([a-zA-Z]{2,})");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.printf(matcher.group() + " ");
        }
    }
}
