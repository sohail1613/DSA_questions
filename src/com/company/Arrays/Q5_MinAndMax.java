package com.company.Arrays;

import java.util.Scanner;

public class Q5_MinAndMax {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size= aa.nextInt();

        //array
        int number[] = new int[size];

        //input
        for (int i=0; i<size; i++){
            System.out.print("Enter numbers :");
            number[i] = aa.nextInt();
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        //output
        for (int i=0; i< number.length; i++){
            if (number[i]>max){
                max = number[i];
            }

            if (number[i]<min){
                min = number[i];
            }
        }

        System.out.println("Largest numbers is : "+max);
        System.out.println("Smallest number is : "+min);
    }
}
