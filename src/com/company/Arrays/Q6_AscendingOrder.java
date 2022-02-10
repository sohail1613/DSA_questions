//Take an array of numbers as input and check if it is an array sorted in
//ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//{3, 4, 6, 2} is not sorted in ascending order.

package com.company.Arrays;

import java.util.Scanner;

public class Q6_AscendingOrder {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = aa.nextInt();

        int order[] = new int[size];

        for (int i=0 ; i<size; i++){
            System.out.print("Enter number :");
            order[i]= aa.nextInt();
        }

        boolean isAscending = true;

        for (int i=0; i< order.length-1; i++){
            if (order[i]>order[i+1]){
                isAscending=false;
            }
        }

        if (isAscending){
            System.out.println("The array sorted in ascending order.");
        } else {
            System.out.println("The array sorted is descending order.");
        }
    }
}
