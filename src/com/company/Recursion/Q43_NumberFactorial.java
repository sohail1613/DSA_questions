//https://www.hackerrank.com/challenges/30-recursion/problem

package com.company.Recursion;

public class Q43_NumberFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    static int factorial(int n){
        //base condition
        if (n <= 1){
            return 1;
        }

        return n * factorial(n-1);
    }
}
