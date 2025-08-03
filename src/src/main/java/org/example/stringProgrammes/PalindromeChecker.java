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
        String reversed = "";
        str = str.toLowerCase();
        for(int i = str.length() - 1; i >= 0; i--) {
           reversed += str.charAt(i);
        }
        if (reversed.equals(str))
            return true;
        else
            return false;
    }
}
