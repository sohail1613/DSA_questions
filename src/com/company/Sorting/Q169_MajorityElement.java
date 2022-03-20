//169. Majority Element
//https://leetcode.com/problems/majority-element/

package com.company.Sorting;

public class Q169_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int ret=0;
        for (int i = 0; i < 32; i++) {
            int ones=0, zeros=0;
            for (int j=0; j<nums.length; j++){
                if ((nums[j] & (1 << i)) != 0) {
                ++ones;
            } else
                ++zeros;
            }
        if (ones > zeros)
            ret |= (1 << i);
        }
        return ret;
    }
}
