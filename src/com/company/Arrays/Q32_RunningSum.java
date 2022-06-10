package com.company.Arrays;

import java.util.Arrays;

public class Q32_RunningSum {
    public static int[] runningSum(int[] array){
        int[] runningSum = new int[array.length];
        runningSum[0] = array[0];
        for (int i=1; i<array.length; i++){
            runningSum[i] = runningSum[i-1]+array[i];
        }
        return runningSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] ans = runningSum(array);
        System.out.println(Arrays.toString(ans));
    }
}
