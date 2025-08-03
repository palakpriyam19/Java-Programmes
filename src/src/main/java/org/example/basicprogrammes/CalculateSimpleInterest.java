package org.example.basicprogrammes;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args){
        double principal = 0;
        double rateOfInterest = 0;
        double timeInYears = 0;
        double simpleInterest = 0;
        double amount = 0;
        double compoundInterest = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal (P) Amount: ");
        principal = scanner.nextDouble();
        System.out.println("Enter rate of interest (R): ");
        rateOfInterest = scanner.nextDouble();
        System.out.println("Enter time in years (T): ");
        timeInYears = scanner.nextDouble();

        System.out.println("Calculate Simple Interest... ");
        simpleInterest = calculateSimpleInterest(principal, rateOfInterest, timeInYears);
        System.out.println("Simple Interest is: " +simpleInterest);

        System.out.println("Calculate Amount... ");
        amount = calculateAmount(simpleInterest, principal);
        System.out.println("Amount at the end of " +timeInYears + " is " + amount);

        System.out.println("Calculate Compound Interest... ");
        compoundInterest = calculateCompoundInterest(principal, rateOfInterest, timeInYears);
        System.out.println("Compound Interest is: " +compoundInterest);

        System.out.println("Calculate CI Amount... ");
        amount = calculateCI_Amount(compoundInterest, principal);
        System.out.println("Amount at the end of " +timeInYears + " is " + amount);

        scanner.close();
    }
    static double calculateSimpleInterest(double principle, double rate, double time) {
        return (principle * rate * time) / 100;
    }

    static double calculateAmount(double simpleInterest, double principle) {
        return simpleInterest + principle;
    }

    static double calculateCompoundInterest(double principle, double rate, double time) {
        return principle * Math.pow( (1 + rate/100),time) - principle;
    }

    static double calculateCI_Amount(double compoundInterest , double principle) {
        return compoundInterest + principle;
    }
}
