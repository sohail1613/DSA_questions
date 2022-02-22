//Find the Kth largest and Kth smallest number in an array.

package com.company.Arrays;

import java.util.Scanner;

public class Q14_LargestAndSmallest {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = es.nextInt();
        int largest, smallest;

        int array[] = new int[size];

        //input from user for each index
        for (int i=0; i<size; i++){
            System.out.print("Enter value for "+i+" index: ");
            array[i] = es.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        //output
        for (int i=0; i< array.length; i++){
            //largest
            if (array[i]>max){
                max=array[i];
            }
            //smallest
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Smallest value is: "+min);
        System.out.println("Largest value is: "+max);
    }
}
