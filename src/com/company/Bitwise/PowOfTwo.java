package com.company.Bitwise;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 16; //Note: Fix for n = 0
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
