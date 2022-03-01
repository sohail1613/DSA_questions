package com.company.Arrays;

public class Q18_MaxValue {
    public static void main(String[] args) {
        int arr[] = {3, 8, 6, 99, 80};
        System.out.println(max(arr));
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
}
