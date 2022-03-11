//Largest Sum Contiguous SubArray.
//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
package com.company.Arrays;

public class Q26_SubArraySum {
    public static void main(String[] args) {
        int array[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(array));
    }

    public static int maxSubArray(int nums[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0) sum=0;
        }
        return max;
    }
}
