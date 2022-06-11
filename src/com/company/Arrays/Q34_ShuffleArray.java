package com.company.Arrays;

import java.util.Arrays;

public class Q34_ShuffleArray {
    public static int[] shuffleArray(int[] array, int n){
        int[] shuffled = new int[2*n];
        for (int i=0; i<2*n; i++){
            if (i % 2 == 0)
                shuffled[i] = array[i/2];
            else
                shuffled[i] = array[n+i / 2];
            //we can do with ternary
//            shuffled[i] = i % 2 == 0 ? array[i/2] : array[n+i /2];
        }
        return shuffled;
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,4,3,2,1};
        int num = 4;
//        System.out.println(Arrays.toString(shuffleArray(array, num)));
        int[] ans = shuffleArray(array, num);
        System.out.println(Arrays.toString(ans));
    }
}
