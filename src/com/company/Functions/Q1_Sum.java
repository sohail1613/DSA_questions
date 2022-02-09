//write a function to add 2 numbers

package com.company.Functions;

import java.util.Scanner;

public class Q1_Sum {
    public static int calculateSum(int number1, int number2){
        int sum=number1+number2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int number1= sc.nextInt();
        System.out.print("Enter second number :");
        int number2= sc.nextInt();

        int sum=calculateSum(number1, number2); // call kiya function ko

        System.out.println("Sum of 2 numbers is :"+sum);
    }
}
