//Selection sort

package com.company.Sorting;

import java.util.Arrays;

public class Q2_SelectionSort {
    public static void main(String[] args) {
     int arr[] = {9, 6, 5, -45, -3, 0, 89, 2, 1, -5};
     selection(arr);
     System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max in the remaining array and swap with current index.
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i =start ; i <= end ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
