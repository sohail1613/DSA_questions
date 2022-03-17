package com.company.Sorting;

import java.util.Arrays;

public class Q1_Swap {
    public static void main(String[] args) {
        int arr[] = {-7, 8, 9, -34, 0, 6, 2, 4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr) {
        boolean swapped;
        //run the steps n-1 times.
        for (int i=0; i< arr.length-i; i++){
            swapped = false;
            //for each step, max item will come at the last respective index.
            for (int j=1; j< arr.length; j++){
                //swap if the current item is smaller than the previous item.
                if (arr[j] < arr[j-1]){
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you didn't swap for a particular value of i. it means the array is sorted , hence stop the program
            if (!swapped){ //!false = true
                break;
            }
        }
    }
}
