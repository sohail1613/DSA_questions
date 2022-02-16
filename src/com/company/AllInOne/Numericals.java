package com.company.AllInOne;

import java.util.Scanner;

public class Numericals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1 :");
        int number1 = sc.nextInt();;
        System.out.print("Enter number2 :");
        int number2 = sc.nextInt();
        System.out.print("Enter number3 :");
        int number3 = sc.nextInt();

        //calling functions
        System.out.println("Sum of two numbers is :"+addition(number1,number2));

        System.out.println("Subtraction of two numbers is: "+subtraction(number1,number2));

        leapYear(number1);

        oddEven(number1);

        System.out.println("Largest number is :"+largestNumber(number1,number2,number3));

        fibonacciSeries(number1);

        System.out.println("Sum of the n numbers is: "+numberSum(number1));

        palindromeNumber(number1);
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


    //Leap year
    public static int leapYear(int number){
        if (number%400 == 0 || number%4 ==0 && number%100 !=0){
            System.out.println("It's leap year :"+number);
        } else {
            System.out.println("It's not leap year :"+number);
        }
        return number;
    }

    //Check odd and even numbers
    public static void oddEven(int number){
        if (number%2==0){
            System.out.println("Given number is even :"+number);
        } else {
            System.out.println("Given number is odd :"+number);
        }
    }

    //check and print largest number
    public static int largestNumber(int number1, int number2, int number3){
        int temp, largest;
        if (number1>number2){
             temp=number1;
        } else {
            temp =number2;
        }
        if (temp>number3){
            largest=temp;
        } else {
            largest=number3;
        }
        return largest;
    }

    //Print fibonacci series
    public static void fibonacciSeries(int number){
        int temp1=0;
        int temp2=1;
        int temp3;
        System.out.print("Fibonacci series of "+number+" is :");
        System.out.print(temp1+" "+temp2);

        for (int i=2; i<=number; i++){
            temp3=temp1+temp2;
            System.out.print(" "+temp3);
            temp1=temp2;
            temp2=temp3;
        }
        System.out.println();
    }

    //print sum of n numbers
    public static int numberSum(int number){
        int sum=0;
        for (int i=1; i<=number; i++){
            sum=sum+i;
        }
        return sum;
    }

    //palindrome number
    public static void palindromeNumber(int original){
        int duplicate=original;
        int remainder, reverse=0;

        while (original!=0){
            remainder=original%10;
            reverse=reverse*10+remainder;
            original=original/10;
        }
        if (reverse==duplicate){
            System.out.println("Given number is palindrome.");
        } else {
            System.out.println("Given number is not palindrome.");
        }
    }
}
