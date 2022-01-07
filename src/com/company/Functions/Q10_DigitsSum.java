//Print the sum of digits of an integer

package com.company.Functions;

import java.util.Scanner;

public class Q10_DigitsSum {
    public static int printDigitsSum(int number){
        int sum=0;

        while (number!=0){
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println("Sum of an integer is :"+sum);
        return number;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();

        printDigitsSum(number);
    }
}
