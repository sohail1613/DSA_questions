package com.company.Recursion;

public class Q12_Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1234321));
    }

    static int rev(int n){
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int number, int digits){
        if (number%10 == number){
            return number;
        }
        int rem = number % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(number/10, digits-1);
    }

    static boolean palindrome(int num){
        return num == rev(num);
    }
}
