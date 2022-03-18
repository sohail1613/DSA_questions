package com.company.Sorting;


//importing swap method  or we can also write code for swapping.
//asked in Amazon

import static com.company.Sorting.Q4_CyclicSort.swap;

public class Q5_MissingNumber {
    public static void main(String[] args) {
        int arr[] = {4, 0, 1, 3};
        missingNumber(arr);
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //search for first missing number.
        for (int index=0; index < arr.length; index++){
            //case 1
            if (arr[index] != index){
                return index;
            }
        }
        //case 2
        return arr.length;
    }
}
