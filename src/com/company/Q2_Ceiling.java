package com.company;

public class Q2_Ceiling {
    public static void main(String[] args) {
        int array[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(array, target);
        System.out.println(ans);
    }

    //return the index of smallest number >= target
    static int ceiling(int array[], int target){
        //but what if the target is greater than the greatest number in the array
        if (target > array[array.length-1]){
            return -1;
        }

        int start = 0;
        int end = array.length-1;

        while(start <= end){
            //find the middle element
            //int mid = (start + end)/2;
            //it might be possible that (start + end) exceeds the range of int in java
            int mid = start +(end - start)/2;

            if (target < array[mid]){
                end = mid -1;
            } else if (target > array[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
