package com.company.Recursion;

public class Q7_SumOfN {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static int sum(int n){
        //base condition
        if (n <= 1){
            return 1;
        }

        return n + sum(n-1);
    }
}
