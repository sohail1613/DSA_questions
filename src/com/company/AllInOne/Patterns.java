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
    }



    //solid square pattern
    public static void solidSquare(int rowstar, int columnstar) {
        //row stars
        for (int i = 0; i <= rowstar; i++) {
            //column
            for (int j = 1; j <= columnstar; j++) {
                System.out.print("* "); //printing stars
            }
            System.out.println();  //print next line
        }
    }

    //Hollow Square pattern.
    public static void hollowSquare(int rowstar, int colstar){
        //outer stars
        for (int i=0; i<=rowstar; i++){
            //column stars
            for (int j=0; j<=colstar; j++){
                //tracking boundary
                if (i==0 || j==0 || i==rowstar || j==colstar){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); //printing next line
        }
    }

    //Solid Half pyramid pattern
    public static void halfPyramid(int star){
        for (int i=0; i<=star; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Solid inverted half pyramid
    public static void invertedHalfPyramid(int star){
        for (int i=star; i>=1; i--){
            //printing spaces
            for (int j=1; j<=i; j++){
                System.out.print("* "); //printing stars
            }
            System.out.println(); // printing next line
        }
    }

    //Inverted half pyramid rotated.
    public static void halfRotatedPyramid(int star){
        for (int i=1; i<=star; i++){
            //inner and printing spaces
            for (int j=1; j<=star-i; j++){
                System.out.print(" ");
            }

            //inner loop printing stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            //printing next line
            System.out.println();
        }
    }

    //Numerical half pyramid
    public static void numericalHalfPyramid(int number){
        for (int i=1; i<=number; i++){  //outer loop
            for (int j=1; j<=i; j++){  //inner loop
                System.out.print(j+" ");  //printing numbers
            }
            System.out.println();  //printing next line
        }
    }

    //Inverted half numerical pyramid
    public static void numericalHalfInvertedPyramid(int number){
        for (int i=1; i<=number; i++){
            for (int j=1; j<=number-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
