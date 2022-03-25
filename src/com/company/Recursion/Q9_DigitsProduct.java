package com.company.Recursion;

public class Q9_DigitsProduct {
    public static void main(String[] args) {
        System.out.println(product(1342));
    }

    static int product(int n){
        //base condition
        if ( n%10 == n){
            return n;
        }
        return (n%10) * product(n/10);
    }
}
