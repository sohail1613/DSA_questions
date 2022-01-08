//Check the given number is prime or not

package com.company.Functions;

import java.util.Scanner;

public class Q16_PrimeNumber {
    public static void checkPrimeNumber(int number){
        for (int i=2; i<number; i++){
            if (number%i==0){
                System.out.println("Given number is not prime :"+number);
            }else {
                System.out.println("Given number is prime :"+number);
            }
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();

        checkPrimeNumber(number);
    }
}
