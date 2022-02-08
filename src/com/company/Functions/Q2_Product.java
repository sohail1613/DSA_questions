//Print product of 2 numbers using Function (inputs from user)

package com.company.Functions;

import java.util.Scanner;

public class Q2_Product {
    public static int calculateProduct(int number1, int number2){
        return  (number1*number2); // we can directly without another variable
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int number1= sc.nextInt();
        System.out.print("Enter second number :");
        int number2= sc.nextInt();

        // we can directly call Function into print statement.
        System.out.println("Product of 2 numbers :"+calculateProduct(number1, number2));
    }
}
