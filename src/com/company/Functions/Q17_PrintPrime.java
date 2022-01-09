//print prime number from 1 to 100.

package com.company.Functions;

import java.util.Scanner;

public class Q17_PrintPrime {
public static void printPrimeNumbers(int number) {
    number = 100;
    for (int i = 2; i < 100; i++) {
        if (100 % i == 0) {
            System.out.println("It's not prime :" + number);
        } else {
            System.out.print("Prime numbers are :");
            System.out.print(" "+ i + " ");
        }
    }
}

    public static void main(String[] args) {
        int number=100;
        printPrimeNumbers(number);
    }
}
