package com.company.BinarySearch;
//https://leetcode.com/problems/fair-candy-swap/

import java.util.Arrays;

public class Q15_CandySwap {
    public static void main(String[] args) {
        int aliceSizes[] = {1,1};
        int bobSizes[] = {2,2};

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum_a=0, sum_b =0;
        for(int i=0; i<aliceSizes.length; i++){
            sum_a += aliceSizes[i];
        }
        for(int i=0; i<bobSizes.length; i++){
            sum_b += bobSizes[i];
        }

        int target = (sum_a - sum_b)/2;

        int res[] = new int[2];

        for(int i=0; i<aliceSizes.length; i++){
            for(int j=0; j<bobSizes.length; j++){
                if(aliceSizes[i] == bobSizes[j] + target){
                    res[0] = aliceSizes[i];
                    res[1] = bobSizes[j];
                }
            }
        }
        return res;
    }
}
