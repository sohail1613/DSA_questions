//Check the given number is palindrome or not (if yes print number)

package com.company.Functions;

import java.util.Scanner;

public class Q14_Palindrome {
    public static boolean isPalindrome(int number){
        int temp = number;
        int reverse=0;
        int remainder;
        while (number!=0){
            remainder=number%10;
            reverse = reverse*10+remainder;
            number /= 10;
        }

        if (temp==reverse){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();

        if (isPalindrome(number)){
            System.out.println("It's a palindrome number :"+number);
        } else {
            System.out.println("It's not a palindrome :"+number);
        }
    }
}
