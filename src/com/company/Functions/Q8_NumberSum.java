//using function print the sum of n numbers and take inout from user.

package com.company.Functions;

import java.util.Scanner;

public class Q8_NumberSum {
    public static int sumNNumber(int number){
        int sum=0;
        for (int i=1; i<=number; i++){
            sum=sum+i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for sum :");
        int number= sc.nextInt();

        int sum=sumNNumber(number); //function called
        System.out.print("Sum of the given number is :");
        System.out.println(sum);
    }
}
