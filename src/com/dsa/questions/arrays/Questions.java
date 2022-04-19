package com.dsa.questions.arrays;

public class Questions {
//    //Q1_Build Array from Permutation
    public int[] buildArray(int[] arr){
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }

//    Q2_Concatenation of Array
    public int[] concatenate(int[] array1){
        int[] array= new int[2*array1.length];
        for (int i=0; i< array1.length; i++){
            array[i] = array1[i];
            array[i+ array1.length] = array1[i];
        }
        return array;
    }

    //using two different array for concatenation
    public  int[] concat(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+ arr2.length];
        int i=0;
        for (int element: arr1){
            arr3[i] = element;
            i++;
        }
        for (int element: arr2){
            arr3[i] = element;
            i++;
        }
        return arr3;
    }

//    Running Sum of 1d Array
    public int[] runningSum(int[] array){
        int[] runningSum = new int[array.length];
        runningSum[0] = array[0]; //initializing sum zero

        for (int i=1; i < array.length; i++){
            //runningSum[i-1] means adding previous value to the current value
            runningSum[i] = runningSum[i-1] + array[i];
        }
        return runningSum;
    }

//    Richest Customer Wealth
    public int maxWealth(int[][] array){
        int ans = Integer.MIN_VALUE; // assign it to min  value, or zero

        for (int[] element : array){ // for each sub-array element in the array
            int sum = 0;
            for (int i : element){
                sum = sum+i;
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }

//   1470. Shuffle the Array
    public int[] shuffleArray(int[] arr, int n){
        int[] result = new int[arr.length];
        int start = 0;
        int end = arr.length - n; //we can also use by dividing length to half of array length
        for (int i=0; i<arr.length; i++){
            if (i % 2 == 0){
                result[i] = arr[start++];
            } else {
                result[i] = arr[end++];
            }
        }
        return result;
    }
}
