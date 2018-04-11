package com.company;

public class Assignment {
    public static void main(String[] args) {

        //do while loop to print the sum of 1 to 100
        // While Loop
        /*while (some condition is true){
            //..something that you want to do
        }*/

        // Print "Hello World" 4 times


        int sum = 0;
        int i = 0;      // i is 0 Here

        do{
            sum += i;
            i++;
        }while(i < 100 );

        System.out.println("The sum is " + sum);

        //while to print all even numbers from 1000 to 100

         /*       for (int i = 0; i < 100; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }*/

/*        int a = 0;
        while (a < 100){
            System.out.println(a);
            a++;
        }*/

        int a = 1000;
        while (a >= 100){

            System.out.println(a);
            a-=2;

        }


    }
}
