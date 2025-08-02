package org.example;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
        int num = 0;
        long factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: " );
        num = scanner.nextInt();
        factorial = factorial(num);
        scanner.close();
        System.out.println("Factorial of a number is: " + factorial);
    }

    public static long factorial(int num){
        long factorial = 1;
        if (num < 0) {
            System.out.println("Factorial is not applicable on negative numbers");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}
