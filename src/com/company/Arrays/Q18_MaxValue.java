package com.company.Arrays;

public class Q18_MaxValue {
    public static void main(String[] args) {
        int arr[] = {3, 8, 6, 99, 80};
        System.out.println(max(arr));

        System.out.println(maxRange(arr, 1, 4));
    }

    public static int max(int arr[]){
        int maxValue=arr[0]; //suppose array is not empty
        for (int i=0; i< arr.length; i++){
            if (arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int maxRange(int arr[], int start, int end){
        int maxValue=arr[start];
        for (int i = start; i <= end; i++){
            if (arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
