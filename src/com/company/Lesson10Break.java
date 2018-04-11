package com.company;

public class Lesson10Break {
    public static void main(String[] args) {
        //Break
        /*
        * Break the cases in a switch
        * Break loops
        * Labelled break
        * */

        // BREAK LOOPS

/*
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0){
                System.out.println(i);
                count++;
            }
            if (count == 6){
                break;
            }
        }
        System.out.println(count);
*/





        // LABELLED BREAK

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i);
                System.out.println(j);
                if (j == 1){
                    break;
                }

            }

        }


    }
}
