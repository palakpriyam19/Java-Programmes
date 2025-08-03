package org.example.basicprogrammes;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        scanner.close();

        int result = 0;
        int originalNumber = num; // 153
        int noOfDigits = String.valueOf(num).length(); // Calculate the number of digits, 3

        while (num != 0) {
            int digit = num % 10;
            result += (int) Math.pow(digit, noOfDigits);
            num = num / 10;
        }

        if (originalNumber == result) {
            System.out.println( originalNumber + " is an armstrong number");
        } else {
            System.out.println( originalNumber + " is NOT an armstrong number");
        }

    }

}
