//print prime number from 1 to 100.

package com.company.Functions;

import java.util.Scanner;

public class Q17_PrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check prime :");
        int number= sc.nextInt();

        if (isPrime(number)){
            System.out.println(number+": is a prime number.");
        } else {
            System.out.println(number+": is not prime number.");
        }
    }

    public static boolean isPrime(int number){
        int i;
        for (i=2; i<=number/2; i++){
            if (number%i==0)
                break;
        }
        return i>number/2;
    }
}
