//https://www.geeksforgeeks.org/recursive-insertion-sort/

//Recursion Idea.
//Base Case: If array size is 1 or smaller, return.
//Recursively sort first n-1 elements.
//Insert last element at its correct position in sorted array.

package com.company.Recursion;

import java.util.Arrays;

public class Q24_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSortRecursive(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSortRecursive(int[] arr, int n){
        //base condition
        if (n <= 1){
            return;
        }
        insertionSortRecursive(arr, n-1);

        int last = arr[n-1];
        int j=n-2;

        while(j >= 0 && arr[j] > last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
