//find the sum of digits of given number

//logic
//        Get the number
//        Declare a variable to store the sum and set it to 0
//        Repeat the next two steps till the number is not 0
//        Get the rightmost digit of the number with help of the remainder ‘%’ operator by dividing it by 10 and add it to sum.
//        Divide the number by 10 with help of ‘/’ operator to remove the rightmost digit.
//        Print or return the sum

package com.company.Basic;

import java.util.Scanner;

public class Q21_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get digit sum :");
        int number= sc.nextInt();
        int sum=0;

        while (number!=0){
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println("sum is :"+sum);
    }
}
