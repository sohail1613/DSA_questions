//check and print the given number is palindrome or not
// approach: original=reversed

package com.company.Basic;

import java.util.Scanner;

public class Q6_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check :");
        int number, reverse, remainder;
        number= sc.nextInt();
        int temp =number;
        reverse=0;

//        for (;number!=0; number=number/10){
//            remainder=number%10;
//            reverse=reverse*10+remainder;
//        }
            while (number!=0){
                remainder=number%10;
                reverse=reverse*10+remainder;
                number=number/10;
            }

        // checking the given number is palindrome or not (by comparing with original number)
        if (reverse==temp){
            System.out.println("Yes, the given number is palindrome");
            System.out.println("The given number is :"+temp);
            System.out.println("The reverse of give number is :"+reverse);
        } else {
            System.out.println("No, the given number is not palindrome");
            System.out.println("Reverse of the given number is :"+reverse);
        }
    }
}
