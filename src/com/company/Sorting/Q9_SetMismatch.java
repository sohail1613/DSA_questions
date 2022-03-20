package com.company.Sorting;

import java.util.Arrays;

public class Q9_SetMismatch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4};
        //findErrorNums(arr);
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
        //searching for first missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }

    //swapping
    public static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
