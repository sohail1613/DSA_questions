package com.company.Bitwise;

public class OddEven {
    public static void main(String[] args) {
        int n= 67;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int number){
        return (number & 1) == 1;
    }
}
