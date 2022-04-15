// till the user enter zero(0) and print the sum of all numbers.

package com.company.Functions;

import java.util.Scanner;

public class Q19_InputSum {
    public static int printInputSum(int number){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter number :");
            number = sc.nextInt();

            //terminating condition, when user enter zero.
            if (number == 0){
                break;
            } else {
                sum += number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();

        System.out.println(printInputSum(number));
    }
}