package com.company.BinarySearch;

public class Q4_InfiniteArray {
    public static void main(String[] args) {
        int array[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(array, target));
    }

    static int ans(int array[], int target){
        //first find the range
        //first start with a box of size two
        int start = 0;
        int end = 1;

        //condition for the target to  lie into the range
        while( target > array[end]){
            int temp = end +1; ///it's new start
            //double the box value
            // end= = previous end + (size of box)*2;
            end = end + (end - start+1)*2;
            start = temp;
        }
        return binarySearch(array, target, start, end);
    }

    static int binarySearch(int array[], int target, int start, int end){
        while(start <= end){
            //find the middle element
            int mid = start + (end-start)/2;

            if (target < array[mid]){
                end = mid - 1;
            } else if (target > array[mid]){
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
