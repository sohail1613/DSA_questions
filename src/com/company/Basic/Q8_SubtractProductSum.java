//Subtract the product and sum of an integer.

package com.company.Basic;

import java.util.Scanner;

public class Q8_SubtractProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //for product
        System.out.print("Enter first number :");
        int number1 = sc.nextInt();
        System.out.print("Enter Second number :");
        int number2 = sc.nextInt();
        //performing product of number1 and number2
        int product=number1*number2;
        System.out.println("Product of number1 & number2 is :"+product);

        // for sum
        System.out.print("Enter third number :");
        int number3= sc.nextInt();
        System.out.print("Enter fourth number :");
        int number4 = sc.nextInt();
        //performing addition operation
        int sum=number3+number4;
        System.out.println("Sum od number3 & number4 is :"+sum);

        //Subtracting product and sum
        int result=product-sum;
        System.out.println("The result of product and sum is :"+result);
    }
}
