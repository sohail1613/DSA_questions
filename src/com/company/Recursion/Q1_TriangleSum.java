//https://www.geeksforgeeks.org/sum-triangle-from-array/

package com.company.Recursion;

import java.util.Arrays;

public class Q1_TriangleSum {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        //triangle(array);
        sumTriangle(array);
    }

    static void sumTriangle(int arr[]){
        //base condition
        if (arr.length < 1){
            return;
        }
        int temp[] = new int[arr.length-1];
        for (int i = 0; i < arr.length-1 ; i++) {
            int x = arr[i] + arr[i+1];
            temp[i] = x;
        }

        sumTriangle(temp);

        System.out.println(Arrays.toString(arr));
    }
}
