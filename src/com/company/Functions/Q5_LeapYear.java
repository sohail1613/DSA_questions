//Find leap year using Function (input from user).

//conditions for leap year
// First year should be completely divisible by 400
// Second year should be completely divisible by 4 but not by 100
//then its only leap_year
package com.company.Functions;

import java.util.Scanner;

public class Q5_LeapYear {
    public static void printLeapYear(int year){
        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.print("It is a leap year :"+year);
        } else {
            System.out.println("It's not leap year :"+year);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year :");
        int year = sc.nextInt();

        printLeapYear(year);  // Function call
    }
}
