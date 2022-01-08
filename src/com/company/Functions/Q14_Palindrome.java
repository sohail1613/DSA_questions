//Check the given number is palindrome or not (if yes print number)

package com.company.Functions;

import java.util.Scanner;

public class Q14_Palindrome {
    public static void printPalindrome(int number){
        int temp = number;
        int reverse=0;
        int remainder;
        while (number!=0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }

        if (temp==reverse){
            System.out.println("Yes, given number is palindrome");
            System.out.println("Given number is :"+temp);
            System.out.println("Reverse of the given number is: "+reverse);
        } else {
            System.out.println("Given number is not palindrome "+temp+" != "+reverse);
        }
        return ;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();

        printPalindrome(number);
    }
}
