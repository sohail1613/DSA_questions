//Find the given year is leap or not (input from user)
//https://www.geeksforgeeks.org/java-program-to-find-if-a-given-year-is-a-leap-year/
package com.company.Basic;

import java.util.Scanner;

public class Q1_Leapyear {

// Change The Class Name as Q1_LeapYear //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year :");
        int year= sc.nextInt();

        if (year%400==0 || year%4==0 && year%100!=0){
            System.out.println(year+" it is a given leap year");
        } else {
            System.out.println(year+" not a leap year");
        }
    }
}
