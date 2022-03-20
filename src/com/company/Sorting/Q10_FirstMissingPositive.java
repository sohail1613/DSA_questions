//https://leetcode.com/problems/first-missing-positive/

package com.company.Sorting;

public class Q10_FirstMissingPositive {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0};
        System.out.println(positiveMissing(arr));
    }

    public static int positiveMissing(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //searching for first missing number
        for (int index = 0; index < arr.length; index++) {
            //case 1:
            if (arr[index] != index+1){
                return index+1;
            }
        }
        //case 2:
        return arr.length+1;
    }

    //swapping
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
