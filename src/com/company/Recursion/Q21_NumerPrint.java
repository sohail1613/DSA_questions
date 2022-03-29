//https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/#

package com.company.Recursion;


public class Q21_NumerPrint {
    public static void main(String[] args) {
        numbers(10);
    }

    private static void numbers(int n) {
        //base condition
        if (n == 1){
            System.out.print(n+" ");
            return;
        }
        numbers(n-1);
        System.out.print(n+" ");
    }
}
