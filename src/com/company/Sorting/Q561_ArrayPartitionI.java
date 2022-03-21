//https://leetcode.com/problems/array-partition-i/

package com.company.Sorting;

import java.util.Arrays;

public class Q561_ArrayPartitionI {
    public static void main(String[] args) {
        int array[] = {1,4,3,2};
        System.out.println(arrayPairSum(array));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0; i<nums.length; i+=2){
            result = result+nums[i];
        }
        return result;
    }
}
