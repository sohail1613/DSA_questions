//Swap two numbers

package com.company.Basic;

import java.util.Scanner;

public class Q20_SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number :");
        int number1= sc.nextInt();
        System.out.print("Enter second number :");
        int number2 = sc.nextInt();

        // swapping numbers
        int temp = number1;
        number1=number2; // number2 becomes number1
        System.out.println("number1 :"+number1);
        number2=temp; //number1 becomes number2
        System.out.println("number2 :"+number2);
    }
}
