//https://leetcode.com/problems/binary-search/

package com.company.Recursion;

public class Q704_BinarySearch {
    public static void main(String[] args) {
       int[] nums = {-1,0,3,5,9,12};
       int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1; //last element of array

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){ //if target is in LHS
                end = mid-1;
            } else if(target > nums[mid]){ //if target is in RHS
                start = mid+1;
            } else{
                return mid; //answer found
            }

        }
        return -1; //in case target not found
    }
}
