package com.company;

public class Lesson12Strings {
    public static void main(String[] args) {
        //STRINGS
        /*
        * STRINGS
        * STRING BUILDER
        * STRING BUFFER
        * */

        // TYPES OF STRING
        String str ="Hello String";
        //System.out.println(str.length());// counting the length of the string.


        String nullStr = null;
        nullStr = "Hello nullstr";

        String newStr = new String("Hello newStr");

        String string = String.valueOf("Hello String string");

        //CONCATENATING STRINGS

/*
        String s1 = "Hello from";
        String s2 = "Joshua";
        //String s3 = s1.concat(s2);
        String s3 = s1 + " " + s2;

*/


        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hEllo";
        String s4 = new String("Hello");

        String s5 = "\tHello\n";

        //EXAMPLE II

        String s6 = "Hello from Josh";
        System.out.println(s6);
        System.out.println(s6.length());
        //System.out.println(s6.charAt(0));// Gives the first letter

        // Gives the position of the letter
        int index = s6.indexOf('f');
        System.out.println(index);

        for (int i = 0; i < s6.length(); i++){
            //System.out.println(s6.charAt(i));
        }
    }
}
