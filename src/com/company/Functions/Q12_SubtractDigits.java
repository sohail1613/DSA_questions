package com.company.Functions;

import java.util.Scanner;

public class Q12_SubtractDigits {
    public static int subtractDigitsProductSum(int number) {
        int sum = 0;
        int product = 1;

        while (number > 0){
            int digit = number % 10;
            sum = sum + digit;              //sum += digit;
            product = product * digit;      //product *= digit;
            number = number / 10;         //number /= 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer digits :");
        int number = sc.nextInt();

        //subtractDigitsProductSum(number);
        System.out.println("Final answer is :"+subtractDigitsProductSum(number));
    }
}
