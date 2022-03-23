//Fibonacci with recursion.

package com.company.Recursion;

public class Q3_Fibo {
    public static void main(String[] args) {
        int ans = fibo(10);
        System.out.println(ans);
    }

    static int fibo(int n) {
        // base condition
        //otherwise stack overflow error will popup.
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

