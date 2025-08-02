package org.example;

import java.util.Scanner;

public class MultipleFloatingPointNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        float num1 = scanner.nextFloat();
        System.out.println("Enter second number");
        float num2 = scanner.nextFloat();
        multiplyFloatingPointNumbers(num1, num2);
        scanner.close();
    }

    static float multiplyFloatingPointNumbers(float n1, float n2) {
        float result = n1 * n2;
        System.out.println("Multiplication result: " +result);
        return result;
    }
}
