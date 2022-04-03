package com.company.Recursion;

public class Q44_Sorted {
    public static void main(String[] args) {
        int[] array = { 20, 23, 23, 45, 78, 88, 34};
        int size = array.length;
        if (sortedArray(array, size) != 0){
            System.out.println("Yes, Sorted");
        } else {
            System.out.println("Not, Sorted");
        }
    }

    static int sortedArray(int array[], int n){
        if(n == 0 || n == 1){
            return 1;
        }
        if (array[n-1] < array[n-2]){
            return 0;
        }

        return sortedArray(array, n-1);
    }
}
