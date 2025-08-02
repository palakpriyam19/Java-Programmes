package org.example;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args){
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = scanner.nextInt();
        if(isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year");
        }
        scanner.close();
    }
    public static boolean isLeapYear(int year){
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
