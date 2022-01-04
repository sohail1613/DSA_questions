package com.company.Basic;

import java.util.Scanner;
// Change The Class Name as Q1_LeapYear //
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year :");
        int year= sc.nextInt();

        if (((year%4==0)&&(year%100!=0)) || (year%100==0)){
            System.out.println(year+" it is a given leap year");
        } else {
            System.out.println(year+" not a leap year");
        }
    }
}
