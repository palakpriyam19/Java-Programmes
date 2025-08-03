package org.example.basicprogrammes;

import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = scanner.nextInt();
        neonNumberChecker(num);
        scanner.close();
    }

    static void neonNumberChecker(int n) {
        int sq = n * n;
        int sum = 0;
        int sum2 = 0;
        int digit = String.valueOf(n).length();
        int originalNum = n;

        while (sq != 0) {
            int i = sq % 10;
            sum = sum + i;
            sq = sq / 10;
        }

        if (digit > 1) {
            while (n != 0) {
                sum2 += n % 10;
                n = n / 10;
            }
        }

        if (sum == sum2)
            System.out.println(originalNum + " is a neon number");
        else
            System.out.println(originalNum + " is not a neon number");
    }
}
