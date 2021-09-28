package com.company;

public class Main {

    public static void main(String[] args) {
        /*Problem 2:Convert the following binary numbers to decimal notation.
        Do not use any Java functions or online conversion applications to calculate
        the answer as this will hinder the learning process and your understanding of the concept.
                However, you may check your answers using Java methods.
        0010 -2
        1001 - 9
        0011 0100 -52
        0111 0010 - 114
        0010 0001 1111 - 543
        0010 1100 0110 0111- 11367



        problem 6: Write a program that declares an integer variable, assigns a number, and uses a postfix
        increment operator to increase the value. Print the value before and after the increment
        operator.

        int x = 10;
        System.out.println("The value of x before the increment " + x);
        x++ ;
        System.out.println("The value of x after the increment " + x);


        Problem 7 :Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this
        multiple times. Assign a value to an integer variable, print it, increment by 1, print it again,
        increment by 1, and then print again.


        int x = 5 ;
        System.out.println("The value of x before the increment " + x);
        x++ ;
        System.out.println("The value of x after the increment first way " + x);
        ++x;
        System.out.println("The value of x after the increment second way " + x);
        x = x +1 ;
        System.out.println("The value of x after the increment third way " + x);

        Problem 8: Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x
        and 8 to y.
        Create another variable sum and assign the value of ++x added to y and print the result.
        Notice the value of the sum (should be 14). Now change the increment operator
        to postfix (x++) and re-run the program. Notice what the value of sum is.
                The first configuration incremented x and then calculated the sum while the
        second configuration calculated the sum and then incremented x.


        int x = 5 , y =8;
        int sum = ++x +y ;
        System.out.println("The value of x before the increment " + sum);

        int x = 5 , y =8;
        int sum = x++ +y ;
        System.out.println("The value of x before the increment " + sum);
//        The sum value is 13

        Problem 3: Write a program that declares an integer a variable x and assigns
        the value 2 to it and prints out the binary string version of the
        number (Integer.toBinaryString(x) ).

         */
         String x = Integer.toBinaryString(10);
         String y = Integer.toBinaryString(1424567);
         String hex = Integer.toHexString(10);

        System.out.println("the binary version is " + x);
        System.out.println("the binary version is " + y);
        System.out.println("the binary version is " + hex);
    }
}