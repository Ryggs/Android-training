package com.company;

import com.sun.org.apache.bcel.internal.generic.FieldOrMethod;

public class Lesson7 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++ ){
            System.out.println("For Loop");
        }

        //Vary te control variable from 1 to 10 in increments of 1.
        for (int i = 1; i <= 10; i++)
        {
            System.out.println( "Increments of 1");
        }

        //Vary the control variable from 10 to 1 in decrements of 1.
        for (int i = 10; i >=1; i--)
        {
            System.out.println("Decrements of 1");
        }

        // Vary the control variable from 6 to 66 in increments of 6.
       for (int i = 6; i <= 66; i += 6)
        {
            System.out.println("Increments of 6");
        }

        // vary the control variable from 100 to 500 in increments of 100.
        for (int k = 100; k <=500; k += 100)
        {
            System.out.println("Increments of 10");
        }

        // Vary the control variable from 100 to 1000 in  increment of 100.
        for (int j = 100; j <=1000; j += 100)
        {
            System.out.println("Increments of 100n");
        }
    }
}
