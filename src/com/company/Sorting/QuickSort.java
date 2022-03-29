package com.company.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        sort(arr, 0, arr.length-1);
    }

    static void sort(int[] nums, int low, int high){
        if (low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start+(end - start) / 2;
        int pivot = nums[mid];

        while(start <= end){
            //also a reason why if its already sorted it will not swap
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }

            if (start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }
        //now my pivot is at correct index, please sort two halves now
        sort(nums, low, end);
        sort(nums, start, high);
    }
}
