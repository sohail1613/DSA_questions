// till the user enter zero(0) and print the sum of all numbers.

package com.company.Functions;

import java.util.Scanner;

public class Q19_InputSum {
    public static void printInputSum(int number){
        int sum=0;
        System.out.print("Enter number :");
        while (true){

            if (number==0)
                break;   // Terminating on pressing zero(0)
            else {
                sum=sum+number;
            }
        }
        System.out.println("Sum of all inputs :"+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();

        printInputSum(number);
    }
}