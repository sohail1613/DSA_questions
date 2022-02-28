package com.company.Basic;

import java.util.Scanner;

public class Q25_CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number :");
        int number = in.nextInt();

        System.out.print("Enter number to search: ");
        int search = in.nextInt();

        int count=0;

        while (number>0){
            int remainder = number%10;
            if (remainder == search){
                count ++;
            }
            number /= 10;
        }
        System.out.println("Total number of times "+search+" appeared: "+count);
    }
}
