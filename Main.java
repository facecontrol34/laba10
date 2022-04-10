package com.company;

import java.util.Scanner;

public class Main {
    public static void minWard(String str) {
        String[] words = str.split(" ");
        int lengthOfMinWord = words[0].length();
        String minWord = words[0];
        for (String word : words) {
            int lengthOfCurrentWord = word.length();
            if (lengthOfMinWord > lengthOfCurrentWord) {
                lengthOfMinWord = lengthOfCurrentWord;
                minWord = word;
            }
        }

        System.out.println("Самое короткое слово: " + minWord);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str =in.nextLine();
        minWard(str);
    }
}













