package org.example;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args){
        double breadth;
        double length;
        double perimeter;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = scanner.nextInt();
        System.out.println("Enter breadth: ");
        breadth = scanner.nextInt();
        scanner.close();

        perimeter = findPerimeter(length, breadth);
        System.out.println("Perimeter is: " +perimeter);

        area = findArea(length, breadth);
        System.out.println("Area is: " +area);
    }

    static double findPerimeter(double l, double b) {
        return l + b;
    }

    static double findArea(double l, double b) {
        return l*b;
    }
}
