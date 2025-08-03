package org.example.basicprogrammes;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input num1");
        num1 = scanner.nextInt();
        System.out.println("Input num2");
        num2 = scanner.nextInt();
        swapNumbers(num1, num2);
        scanner.close();
    }

    static void swapNumbers(int n1, int n2) {
        System.out.println("Before swap: num1= " +n1 + "num2= " +n2);
        int temp = 0;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swap: num1= " +n1 + "num2= " +n2);
    }
}
