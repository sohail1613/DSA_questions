//Write a program to print factorial using Function

package com.company.Functions;

import java.util.Scanner;

public class Q4_Factorial {
    public static int printFactorial(int number){
        int factorial=1;
        // using for loop
        for (int i =number; i>=1; i--){
            factorial=factorial*i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();

        int factorial = printFactorial(number); // calling function
        System.out.println("Factorial is :"+factorial);
    }
}
