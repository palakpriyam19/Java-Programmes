package org.example.stringProgrammes;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args){
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = scanner.nextLine();
        scanner.close();
        if(palindromeChecker(str))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is NOT a Palindrome");
    }

    private static boolean palindromeChecker(String str){
        StringBuilder reversed = new StringBuilder();
        str = str.toLowerCase();
        for(int i = str.length() - 1; i >= 0; i--) {
           reversed.append(str.charAt(i));
        }
        return reversed.toString().equals(str);
    }
}
