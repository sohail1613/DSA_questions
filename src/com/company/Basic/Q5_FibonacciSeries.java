//find Fibonacci series upto n numbers
// fibonacci series= sum of previous two values

package com.company.Basic;

import java.util.Scanner;

public class Q5_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int term1=0;
        int term2=1;
        int term3;
        System.out.print("Enter number to get Fibonacci series :");
        int number= sc.nextInt();
        System.out.println("Fibonacci series of the "+number+" is: ");
        System.out.print(term1+" "+term2);


        for (int i=2; i<=number; i++){  // because we already use 0and 1
            term3=term1+term2;
            System.out.print(" "+term3);
            term1=term2;
            term2=term3;
        }

    }
}
