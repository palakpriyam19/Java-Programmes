package org.example;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        n1 = scanner.nextInt();
        System.out.println("Enter num 2: ");
        n2 = scanner.nextInt();
        System.out.println("Enter num 3: ");
        n3 = scanner.nextInt();
        findLargestNumber(n1, n2, n3);
        scanner.close();
    }

    static void findLargestNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest of the three numbers");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest of the three numbers");
        } else {
            System.out.println(num3 + " is the largest of the three numbers");
        }
    }

}
