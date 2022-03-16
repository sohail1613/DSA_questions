package com.company.BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class Q12_MountainIndex {
    public static void main(String[] args) {
        int array[] = {0, 1, 0};
        int target = 0;

        System.out.println(peakIndexInMountainArray(array));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        return getPeakIndex(arr);
    }

    static int getPeakIndex(int arr[]){
        //In case element not found, then (return -1)
        if(arr.length == 0){
            return -1;
        }

        int start=0, end = arr.length -1, target =0;
        while(start < end){
            int mid = start + (end - start)/2;
            target = arr[mid+1];

            if(target < arr[mid]){
                end = mid;
            } else if(target > arr[mid]){
                start = mid+1;
            }
        }
        //In last we can return start or end cause (start = end )
        return end;
    }
}
