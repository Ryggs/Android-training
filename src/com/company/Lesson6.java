package com.company;

public class Lesson6 {
    public static void main(String[] args) {
        //text
        String fname ="Joshua";
        String lname ="Miller";
        String regNumber ="001";
        System.out.println(fname+ " "+ lname+" " +regNumber);
        String fullNames =fname+ " "+lname;
        System.out.println(fullNames);
        String sentence="The quick brown fox jumped over the slow lazy dog";
        //Methods or functions --->
        System.out.println(sentence.toUpperCase());
        String upper = sentence.toUpperCase();
        System.out.println(upper);
        System.out.println(upper.toLowerCase());

        System.out.println(sentence.length());
        // Blank spaces in a password
        sentence="            ";
        sentence = sentence.trim();

        if (sentence.isEmpty())
        {
            System.out.println("Fill in your sentence");
        }
        else
        {
            System.out.println("Your sentence is good");
        }
        String spaceless= upper.replace(" ", "/");//this has to have two parameters -->target and replacement
        // Parameters or arguments
        System.out.println(spaceless);
    }
}
