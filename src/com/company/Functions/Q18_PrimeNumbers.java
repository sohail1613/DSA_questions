//Print prime numbers between 1 and 100.

package com.company.Functions;

public class Q18_PrimeNumbers {
    public  static void printPrimeNumbers(int number){
        number=100;
        int count;

        for (int i=1; i<=number; i++){
            count=0;
            for (int j=2; j<=i/2; j++){
                if (i%j==0){
                    count ++;
                    break;
                }
            }

            if (count==0){
                System.out.print(i+" ");
            }
        }
        return;
    }

    public static void main(String[] args) {
        int number=100;
        printPrimeNumbers(number);  // call kiya function ko
    }
}
