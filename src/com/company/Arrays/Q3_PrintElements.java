//Take an array as input and print its elements

package com.company.Arrays;

import java.util.Scanner;

public class Q3_PrintElements {
    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = eb.nextInt();

        int element[] = new int[size];

        for (int i=0; i<size; i++){
            System.out.print("Enter array elements :");
            element[i] = eb.nextInt();
        }

        //printing array numbers
        System.out.print("Array elements are: ");
        for (int i=0; i< element.length; i++){
            System.out.print(element[i]+" ");
        }
    }
}
