package org.example.basicprogrammes;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        num1 = scanner.nextInt();
        findEvenOddNumber(num1);
        scanner.close();
    }
    static void findEvenOddNumber(int n1) {
        if(n1 % 2 == 0) {
            System.out.println(n1 + " is an even number");
        }
        else {
            System.out.println(n1 + " is an odd number");
        }
    }
}