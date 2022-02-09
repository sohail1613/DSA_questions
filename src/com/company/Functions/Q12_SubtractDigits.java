package com.company.Functions;

import java.util.Scanner;

public class Q12_SubtractDigits {
    public static int subtractDigitsProductSum(int number) {
        int number1 = number;
        //for sum
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Sum of digits is :" + sum);

        //for Product
        int product = 1;
        while (number1 != 0) {
            product = product * (number1 % 10);
            number1 = number1 / 10;
        }
        System.out.println("Product of digits is :" + product);

        int subtract;
        subtract = product - sum;
        System.out.println("The subtracted value of digits product and sum is :" + subtract);

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer digits :");
        int number = sc.nextInt();

        subtractDigitsProductSum(number);
    }
}
