//Print prime numbers between 1 and 100.

package com.company.Functions;

public class Q18_PrimeNumbers {
    public  static boolean printPrimeNumbers(int number){
        int i;
        for (i=2 ; i<=number/2; i++){
            if (number%i==0){
                break;
            }
        }
        return i>number/2;
    }

    public static void main(String[] args) {
        int number=100;
       printPrimeNumbers(number);  // call kiya function ko

        if (printPrimeNumbers(number)){
            System.out.println(number+": is prime");
        }
    }
}
