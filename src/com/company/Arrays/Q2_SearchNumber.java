//Take an array as input from the user. search for a given number x and print the index at which it occurs.

package com.company.Arrays;

import java.util.Scanner;

public class Q2_SearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        //array
        int number[] =new int[size];

        //input
        for (int i=0; i<size; i++){
            System.out.print("Enter numbers :");
            number[i]= sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int x = sc.nextInt();

        //output
        for (int i=0; i<number.length; i++){
            if (number[i]==x){
                System.out.println(x+" found at index :"+i);
            }
        }
    }
}
