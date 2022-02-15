package com.company.AllInOne;

import java.util.Scanner;

public class Numericals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1 :");
        int number1 = sc.nextInt();;
        System.out.print("Enter number2 :");
        int number2 = sc.nextInt();

        //calling functions
        System.out.println("Sum of two numbers is :"+addition(number1,number2));

        System.out.println("Subtraction of two numbers is: "+subtraction(number1,number2));
    }

    //Addition
    public static int addition(int number1, int number2) {
        int sum = number1+number2;
        return sum;
    }

    //subtraction
    public static int subtraction(int number1, int number2){
        return number1-number2;
    }

    public static int leapYear(int number){
        
    }
}
