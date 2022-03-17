//Insertion sort

package com.company.Sorting;


import java.util.Arrays;

public class Q3_InsertionSort {
    public static void main(String[] args) {
        int arr[] = {-6, 9, 0, 45, -34, -2, 90};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1; j>0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }

        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
