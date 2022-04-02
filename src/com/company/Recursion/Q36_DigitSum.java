package com.company.Recursion;

public class Q36_DigitSum {
    public static void main(String[] args) {
        int digit = 12345;
        System.out.println(digitSum(digit));
    }

    static int digitSum(int number){
        //base condition
        if (number < 1){
            return 0;
        }
        return (number%10 + digitSum(number/10));
    }
}
