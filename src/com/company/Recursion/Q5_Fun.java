package com.company.Recursion;

public class Q5_Fun {
    public static void main(String[] args) {
        fun(5);
        System.out.println("Reversed");
        funRev(5);
    }

    static void fun(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n){
        if(n == 0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}
