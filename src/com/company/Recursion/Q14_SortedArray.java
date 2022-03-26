package com.company.Recursion;

public class Q14_SortedArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println(sorted(array, 0));
    }

    static boolean sorted(int arr[], int index){
        //base condition
        if (index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
}
