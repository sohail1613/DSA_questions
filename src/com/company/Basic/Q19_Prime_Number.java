//check given number is prime number or not.
//https://thirdspacelearning.com/blog/what-is-a-prime-number/
package com.company.Basic;

import java.util.Scanner;

public class Q19_Prime_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();  // asking input number from user

        //applying condition if the given number is divisible by 1 & itself then only its prime
        for (int i=2; i<number; i++){
            boolean isPrime = true;
//            if (number%i==0){
//                System.out.println("Not a prime number: "+number);
//                break;
//            } else{
//                System.out.println("prime number: "+number);
//                break;
//            }
//            //return;
            for (int j=2; j<i; j++){
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }

            if (isPrime){
                System.out.println(i);
            }
        }
    }
}
