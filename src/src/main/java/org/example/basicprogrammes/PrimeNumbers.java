package org.example.basicprogrammes;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        int n1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        n1 = scanner.nextInt();
        primeChecker(n1);
        scanner.close();
    }

    static boolean primeChecker(int num){
        if (num <= 1) {
            System.out.println("Not prime");
            return false;
        } else if (num == 2) {
            System.out.println("Prime!");
            return true;
        } else if (num % 2 == 0) {
            System.out.println("Not prime");
            return false;
        }
        for(int i=3; i <= Math.sqrt(num); i+= 2) {
            if(num % i == 0) {
                System.out.println("Not prime");
                return false;
            }
        }
        System.out.println("Prime!!!");
        return true;
    }
}
