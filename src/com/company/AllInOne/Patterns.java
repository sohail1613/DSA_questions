//Print all patterns using functions.

package com.company.AllInOne;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 :");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        System.out.println("Solid Square pattern");
        solidSquare(number1, number2);  //solid square pattern

        System.out.println("Hollow Square pattern");
        hollowSquare(number1, number2); //hollow square pattern

        System.out.println("Solid half pyramid");
        halfPyramid(number1);

        System.out.println("Inverted half pyramid.");
        invertedHalfPyramid(number1);

        System.out.println("Inverted half and 180 rotated pyramid");
        halfRotatedPyramid(number1);

        System.out.println("Half number pyramid");
        numericalHalfPyramid(number1);

        System.out.println("Inverted numerical half pyramid");
        numericalHalfInvertedPyramid(number1);

//        System.out.println("Floyd's triangle");
//        floydTriangle(number1);

        System.out.println("Binary pattern");
        binaryPattern(number1);

        System.out.println("Solid rhombus");
        solidRhombus(number1);

        System.out.println("Number pyramid");
        numberPyramid(number1);

        System.out.println("Palindrome pattern.");
        palindrome(number1);

        System.out.println("Diamond pattern");
        diamondPattern(number1);

        System.out.println("Solid Butterfly pattern");
        solidButterfly(number1);

        System.out.println("Hollow Rhombus");
        hollowRhombus(number1);

    }


    //solid square pattern
    public static void solidSquare(int row, int column) {
        //row stars
        for (int i = 0; i <= row; i++) {
            //column
            for (int j = 1; j <= column; j++) {
                System.out.print("* "); //printing stars
            }
            System.out.println();  //print next line
        }
    }

    //Hollow Square pattern.
    public static void hollowSquare(int row, int column) {
        //outer stars
        for (int i = 0; i <= row; i++) {
            //column stars
            for (int j = 0; j <= column; j++) {
                //tracking boundary
                if (i == 0 || j == 0 || i == row || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); //printing next line
        }
    }

    //Solid Half pyramid pattern
    public static void halfPyramid(int star) {
        for (int i = 0; i <= star; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Solid inverted half pyramid
    public static void invertedHalfPyramid(int star) {
        for (int i = star; i >= 1; i--) {
            //printing spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); //printing stars
            }
            System.out.println(); // printing next line
        }
    }

    //Inverted half pyramid rotated.
    public static void halfRotatedPyramid(int star) {
        for (int i = 1; i <= star; i++) {
            //inner and printing spaces
            for (int j = 1; j <= star - i; j++) {
                System.out.print(" ");
            }

            //inner loop printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //printing next line
            System.out.println();
        }
    }

    //Numerical half pyramid
    public static void numericalHalfPyramid(int number) {
        for (int i = 1; i <= number; i++) {  //outer loop
            for (int j = 1; j <= i; j++) {  //inner loop
                System.out.print(j + " ");  //printing numbers
            }
            System.out.println();  //printing next line
        }
    }

    //Inverted half numerical pyramid
    public static void numericalHalfInvertedPyramid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //Floyd's Triangle
    public static void floydTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }

    //Binary pattern
    public static void binaryPattern(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) { //even
                    System.out.print(1 + " ");
                } else { //odd
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    //Solid Rhombus
    public static void solidRhombus(int star) {
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= star - i; j++) { //printing spaces
                System.out.print(" ");
            }
            //printing stars
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Number pyramid
    public static void numberPyramid(int number) {
        for (int i = 1; i <= number; i++) {
            //spaces
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            //printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //Palindrome pattern
    public static void palindrome(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) { //spaces
                System.out.print(" ");
            }

            //left side
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //right side
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();  //next line
        }
    }
    //Diamond pattern
    public static void diamondPattern(int number) {
        //upper part
        for (int i=1; i<=number; i++) {
            //printing spaces
            for (int j=1; j<=number-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for (int i=number; i>=1; i--) {
            //printing spaces
            for (int j=1; j<=number-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Butterfly pattern
    public static void solidButterfly(int number){
        for (int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces=2*(number-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower portion
        for(int i=number; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            int spaces = 2*(number-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Hollow rhombus
    public static void hollowRhombus(int number){
        for (int i=1; i<=number; i++){
            for (int j=1; j<=number-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=number; j++){
                if (i==1 || j==1 || i==number || j==number){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
