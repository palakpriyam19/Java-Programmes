package org.example.stringProgrammes;

import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args){
        String toBeReversed = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        toBeReversed = scanner.nextLine();
        scanner.close();
        System.out.println("Reversed: " +reverse(toBeReversed));
    }

    static String reverse (String toBeReversed) {
        StringBuilder sb = new StringBuilder(toBeReversed);
        return String.valueOf(sb.reverse());
    }
}
