package com.company.Functions;

import java.util.Scanner;

public class Q24_ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
       int number= sc.nextInt();

       System.out.println("The armstrong number is :"+isArmstrongNumber(number));


        //if we want to print all 3 digits armstrong number
//        for (int i=100; i<1000; i++){
//            if (isArmstrongNumber(i)){
//                System.out.println("Armstrong numbers are : "+i);
//            }
//        }

    }

    static boolean isArmstrongNumber(int number){
        int original = number;
        int sum = 0;

        while (number>0){
            int remainder=number%10;
            number=number/10;
            sum=sum+(remainder*remainder*remainder);
        }
        if (sum==original){
            return true;
        }
        return false;
    }
}
