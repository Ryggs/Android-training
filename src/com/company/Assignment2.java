package com.company;

import java.util.Scanner;

public class Assignment2 {
    /*public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r = s.nextDouble();
        double area=(22*r*r)/7;
        System.out.println("Area of Circle is: " + area);
    }*/

    public static void main(String[] args) {

        System.out.println("Enter the radius:");
        double r=Double.parseDouble(args[0]);

        double area = (22*r*r)/7;

        System.out.println("area" + area);
    }
}
