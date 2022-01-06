//Print largest number (between 3 numbers) input from user using Function.

package com.company.Functions;

import java.util.Scanner;

public class Q7_LargestNumber {
    public static void printLargestNumber(int number1, int number2, int number3){
        int temp, largest;
        if (number1>number2){
             temp =number1;
        } else {
            temp =number2;
        }
        if (temp>number3){
            largest=temp;
        } else {
            largest=number3;
        }
        System.out.println("The largest number is :"+largest);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int number1= sc.nextInt();
        System.out.print("Enter second number :");
        int number2= sc.nextInt();
        System.out.print("Enter third number :");
        int number3= sc.nextInt();

        printLargestNumber(number1, number2, number3);
    }
}
