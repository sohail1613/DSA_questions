//Swap two numbers without using third variable.

package com.company.Functions;

import java.util.Scanner;

public class Q13_Swap {
    public static void swapTwoNumbers(int number1, int number2){
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;

        System.out.println("After swapping numbers becomes :");
        System.out.println("Number1 is :"+number1);
        System.out.println("Number2 is: "+number2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 :");
        int number1= sc.nextInt();
        System.out.print("Enter number2 :");
        int number2 = sc.nextInt();

        swapTwoNumbers(number1, number2);

    }
}
