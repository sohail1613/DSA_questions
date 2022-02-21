//Take input from user and print array in ascending ordre.

package com.company.Arrays;

import java.util.Scanner;

public class Q13_PrintAscending {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int size = as.nextInt();

        int array[] = new int[size];
        int temp=0;

        System.out.println("Original array is :");
        for (int i=0; i<size; i++){
            array[i] = as.nextInt(); //input from user
        }

        //sorting in ascending order
        for (int i=0; i< array.length; i++){
           for (int j=i+1; j< array.length; j++){
               if (array[i] > array[j]){
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }
           }
        }
        System.out.println();

        //printing array in ascending order.
        System.out.print("Ascending order of the array is :");
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
