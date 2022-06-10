package com.company.Arrays;

import java.util.Arrays;

public class Q31_ConcatenateArray {
    public static int[] concatenateArray(int[] arr){
        int[] array = new int[arr.length*2];
        //iterating on arr
        for (int i =0; i<arr.length; i++){
            array[i] = arr[i];  //store elements of arr into array
            array[i+arr.length] = arr[i]; // when arr elements completed then again start filling from arr+i length
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] ans = concatenateArray(array);
        System.out.println(Arrays.toString(ans));
    }
}
