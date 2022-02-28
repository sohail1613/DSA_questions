package com.company.Functions;

import java.util.Scanner;

public class Q26_CountNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number here : ");
        int number = in.nextInt();
        System.out.print("Enter number to count appearance: ");
        int search = in.nextInt();
        System.out.println(times(number, search));
    }

    public static int times(int number, int search){
        int count =0;
        while (number>0){
            int remainder = number%10;
            if (search == remainder){
                count ++;
            }
            number /= 10;
        }
        return count;
    }
}
