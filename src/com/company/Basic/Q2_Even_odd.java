//Find Even and odd numbers.

//Approach
//Leap Year contains 366 days, which comes once every four years. Every leap year corresponds to these facts :
//
//A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
//A leap year (except a century year) can be identified if it is exactly divisible by 4.
//A century year should be divisible by 4 and 100 both.
//A non-century year should be divisible only by 4.

package com.company.Basic;

import java.util.Scanner;

public class Q2_Even_odd {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // System.out.print("Enter number :");
       // int number=sc.nextInt();
        for (int i=1; i<100; i++){
        if (i%2==0){
            System.out.println("It is a even number :"+i);
        } //else {
           // System.out.println("It's odd number :"+number);
        }
    }
}
