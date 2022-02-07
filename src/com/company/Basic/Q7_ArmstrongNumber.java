//write program to find armstrong number.

package com.company.Basic;

import java.util.Scanner;

public class Q7_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();

        int temp=number;
        int sum=0, r;

        while (number!=0){
            r=number%10;
            number=number/10;
            sum=sum+(r*r*r);
        }

        if (temp==sum){
            System.out.println("It's an armstrong number :"+temp);
        } else {
            System.out.println("It's not an Armstrong number :"+temp);
        }
    }
}
