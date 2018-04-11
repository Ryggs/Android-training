package com.company;


import java.util.Scanner;

public class Lesson16 {
    public void areaOfCircle(double radius){
        double result = 22/7.0 * radius * radius;
        System.out.println(result);
    }


    public static void main(String[] args) {

        Lesson16 l = new Lesson16();
        l.areaOfCircle(7.7);
        l.areaOfCircle(54);
        l.areaOfCircle(67);

        //OOP
        /*Scanner input = new Scanner(System.in);//initialize construct object ==> No need to generate new scanner
        System.out.println("Enter First Number :");
        int a = input.nextInt();
        System.out.println("Enter Last Number :");
        int b = input.nextInt();
        int result = a + b;

        System.out.println("The sum is" + " " + result);

        System.out.println("Enter Your Name :");
        String name=input.nextLine();
        System.out.println("Your name is" + " " + name.toUpperCase());
*/
    }


}
