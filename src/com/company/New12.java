package com.company;

import java.util.Scanner;

public class New12 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        double r=s.nextDouble();
        System.out.println("Enter the radius of cone:=" +r);

        double h=s.nextDouble();
        System.out.println("Enter the height of cone:=" +h);

            double volume=(22*r*r*h)/(3*7);

        System.out.println("Volume of Cone is:" +volume);
    }

}
