//Check the given number is prime or not

package com.company.Functions;

import java.util.Scanner;

public class Q16_PrimeNumber {
    public static boolean isPrime(int number){
        int i;
        for (i=2; i<=number/2; i++){
            if (number%i==0){
                //System.out.println("Given number is not prime :"+number);
                break;
            }//else {
               // System.out.println("Given number is prime :"+number);
            }
        return i>number/2;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();

        if (isPrime(number)){
            System.out.println(number+": it is a prime number.");
        } else {
            System.out.println(number+": it's not a prime number.");
        }
    }
}
