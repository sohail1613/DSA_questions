//find lcm without gcd

package com.company.Basic;

import java.util.Scanner;

public class Q24_Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 :");
        int number1= sc.nextByte();
        System.out.print("Enter number2 :");
        int number2= sc.nextByte();

        int large=Math.max(number1,number2);
        int small=Math.min(number1,number2);

        for (int i=large; ; i=i+large){
            if (i%small==0){
                System.out.println("lcm of "+number1+" and "+number2+" is :"+i);
                break;
            }
        }
    }
}
