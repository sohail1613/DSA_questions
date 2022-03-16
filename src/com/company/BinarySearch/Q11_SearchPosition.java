package com.company.BinarySearch;
//https://leetcode.com/problems/search-insert-position/
public class Q11_SearchPosition {
    public static void main(String[] args) {
        int numbers[] = {1, 3, 5, 6};
        int target = 5;

        System.out.println(searchInsert(numbers, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target)  high = mid -1;
            else low = mid +1;
        }
        return low;
    }

}
