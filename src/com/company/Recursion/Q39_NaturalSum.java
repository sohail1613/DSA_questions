package com.company.Recursion;

public class Q39_NaturalSum {
    public static void main(String[] args) {
        System.out.println(sumOfNatural(4));
    }

    static int sumOfNatural(int n){
        if(n == 0){
            return 0;
        }

        return n + sumOfNatural(n-1);
    }
}
