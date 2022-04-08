package com.company.Basic;

public class Q26_MaxImum {
    public static void main(String[] args) {
        int[] nusms = {110, 2, 500, 6, 8, 21, 9, 227, 3};
        System.out.println(maximumElement(nusms));
    }

    static int maximumElement(int[] nums){
        int max =Integer.MIN_VALUE;
        int i = 0;
        while(i < nums.length){
            if (nums[i] > max){
                max = nums[i];
            }
            i++;
        }
        return max;
    }
}
