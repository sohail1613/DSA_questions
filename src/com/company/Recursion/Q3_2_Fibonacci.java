//Write a Java Program to print Fibonacci Series using Recursion.
//main method written at end, to follow convention
package com.company.Recursion;

public class Q3_2_Fibonacci {
    public static void printFibonacci(int first, int second, int num){
        //base condition
        if (num == 0){
            return;
        }
        //printing next element of fibonacci
        System.out.print(first+second+" ");

        //recursive calling for remaining length
        printFibonacci(second, first+second, --num);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci series is: ");
        //first two elements printing
        System.out.print("0 1 ");
        //calling method tp print remaining length
        printFibonacci(0, 1, 10);
    }

}
