package com.company.Recursion;

public class Q8_DigitsSum {
    public static void main(String[] args) {
        System.out.println(digitsSum(1342));
    }

    static int digitsSum(int n){
        //base condition
        if(n == 0){
            return 0;
        }
        return (n%10)+digitsSum(n/10);
    }
}
