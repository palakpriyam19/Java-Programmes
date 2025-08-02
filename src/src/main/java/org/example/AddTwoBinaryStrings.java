package org.example;

import java.util.Scanner;

public class AddTwoBinaryStrings {
    public static void main(String [] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Binary String 1: ");
        num1 = scanner.nextInt();
        System.out.println("Enter Binary String 2: ");
        num2 = scanner.nextInt();
        addBinaryString(num1, num2);
        scanner.close();
    }

    static String addBinaryString(int x, int y) {
        int sum = x + y;
        System.out.println("Sum:" +sum);
        String result = Integer.toBinaryString(sum);
        System.out.println("Result: " +result);
        return result;
    }
}
