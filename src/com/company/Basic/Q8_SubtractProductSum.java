//Subtract the product and sum of an integer.

package com.company.Basic;

import java.util.Scanner;

public class Q8_SubtractProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();
        int number1=number;
        int sum=0;
        int product=1;
        int result;

        //for sum of digits
        while (number!=0) {
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println("Sum of the given integer is :"+sum);

        //for product
        while (number1!=0) {
            product=product*(number1%10);
            number1=number1/10;
        }
        System.out.println("Product of the given integer is :"+product);

        result=product-sum;
        System.out.println("Final result of the given integer is :"+result);
    }
}
