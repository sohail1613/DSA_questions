package com.company.Arrays;

public class Interview {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 9, 13, 54, 67};
        System.out.println(returnMax(array));
    }

    public static int returnMax(int[] arr){
        int max = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}
