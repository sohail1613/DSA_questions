package com.company.BinarySearch;

public class Q1_BinarySearch {
    public static void main(String[] args) {
        int array[] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int answer = binarySearch(array, target);
        System.out.println(answer);
    }

    //return index
    //return -1, if it does not exist
    static int binarySearch(int array[], int target){
        int start  = 0;
        int end = array.length-1;

        while (start <= end){
            //find the middle element.
            //int mid = (start + end) / 2
            //it might be possible that (start + end) exceeds the range int in java
            int mid = start +(end-start)/2;

            if (target < array[mid]){
                end = mid-1;
            } else if (target > array[mid]){
                start = mid+1;
            } else {
                //answer found
                return mid;
            }
        }
        return -1;
    }
}
