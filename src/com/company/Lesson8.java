package com.company;

public class Lesson8 {
    public static void main(String[] args) {

        //Ternary Operator
        int marks = 92;
        char grade;
        if (marks > 90)
        {
            grade = 'A';
        }
        else{
            grade = 'B';
        }
        System.out.println(grade);

        /*// Compressed ternary operator
        int marks = 92;

        char grade = marks > 90 ? 'A' : 'B';
        System.out.println(grade);*/
    }
}
