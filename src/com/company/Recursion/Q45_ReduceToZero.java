//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

package com.company.Recursion;

public class Q45_ReduceToZero {
    public static void main(String[] args) {
        int number = 8;
        System.out.println(numberOfSteps(number));
    }
    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }
    public static int helper(int num, int steps){
        if(num == 0){
            return steps;
        }

        if(num%2 == 0){
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}
