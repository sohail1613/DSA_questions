//https://www.geeksforgeeks.org/recursive-bubble-sort/

//Recursion Idea:
//Base Case: If array size is 1, return.
//Do One Pass of normal Bubble Sort. This pass fixes last element of current subarray.
//Recur for all elements except last of current subarray.

package com.company.Recursion;

import java.util.Arrays;

public class Q23_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 8, 6, 9, 2, 0};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int n){
        //base condition
        if (n == 1){
            return;
        }

        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]){
                //swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            bubbleSort(arr, n-1); //recursion for others cause last element fixed
        }
    }
}
