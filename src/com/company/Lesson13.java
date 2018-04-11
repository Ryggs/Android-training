package com.company;

public class Lesson13 {
    public static void main(String[] args) {
        int x = 54;
        System.out.println(Math.sqrt(x));
        double result =Math.sqrt(54);
        double powered = Math.pow(x, 2);
        System.out.println(powered);

        double area = 3.142 + Math.pow(7,2);// 7*7

        //for denominators put point for integers
        System.out.println(11/5.0);

        powered = Math.round(powered);
        int z = (int)powered;// conversion / type casting --> forcing a number to be another type
        System.out.println(z);

        String y = "10";
        int v = Integer/*class*/.parseInt(y); //converting a string into an integer
        String k = "12.66c";
        double s = Double.parseDouble(k);
    }
}
