//Cyclic sorting

package com.company.Sorting;

import java.util.Arrays;

public class Q4_CyclicSort {
    public static void main(String[] args) {
        int array[] = {5, 4, 3, 2, 1};
        cyclic(array);
        System.out.println(Arrays.toString(array));
    }

    static void cyclic(int[] array) {
        int i=0;
        while(i < array.length){
            int correct = array[i]-1;
            if (array[i] != array[correct]){
                swap(array, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
