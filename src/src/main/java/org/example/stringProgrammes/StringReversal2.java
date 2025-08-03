package org.example.stringProgrammes;

import java.util.Scanner;

public class StringReversal2 {

    public static void main(String[] args){
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = scanner.nextLine();
        scanner.close();
        System.out.println("Reversed String: " +reverseString(str));
    }

    private static String reverseString(String str){
        StringBuilder reversedString = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }
}
