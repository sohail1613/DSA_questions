package com.company.Recursion;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
public class Q10_Steps {
    public static void main(String[] args) {
        int number = 14;
        System.out.println(numberOfSteps(41));

    }


    public static int numberOfSteps(int number){
        return helper(number, 0);
    }

    public static int helper(int number, int steps){
        if (number == 0){
            return steps;
        }

        if (number % 2 == 0){
            return helper(number/2, steps+1);
        }
        return helper(number-1, steps+1);
    }
}
