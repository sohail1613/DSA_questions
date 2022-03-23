package com.company.Recursion;

public class Q4_NumberRecursion {
    public static void main(String[] args) {
        number(1);
    }
     static void number(int n){
        //base condition
         if (n == 5){
             System.out.println(5);
             return;
         }
         System.out.println(n);

         //recursive call
         //if we are call-ing a function again and again, then we will treat it as separate in stack memory.


         //last function call is said to be **Tail Recursion**
         number(n+1);
     }
}
