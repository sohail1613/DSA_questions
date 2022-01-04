//find Fibonacci series upto n numbers
// fibonacci series= sum of previous two values

package com.company.Basic;

import java.util.Scanner;

public class Q5_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1=0;
        int number2=1;
        int number3;
        System.out.print("Enter number to get Fibonacci series :");
        int number= sc.nextInt();
        System.out.println("Fibonacci series of the "+number+" is: ");
        System.out.print(number1+" "+number2);


        for (int i=2; i<=number; i++){  // because we already sue 0and 1
            number3=number1+number2;
            System.out.print(" "+number3);
            number1=number2;
            number2=number3;
        }

    }
}
