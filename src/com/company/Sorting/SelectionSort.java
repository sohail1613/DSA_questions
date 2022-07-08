package com.company.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public void selectionSort(int[] array){
        for (int i=0; i< array.length; i++){
            int last = array.length-i-1;
            int maxIndex = getMaxIndex(array, 0, last);
            swap(array, maxIndex, last);
        }
    }

    private int getMaxIndex(int[] array, int start, int last) {
        int max = start;
        for (int i= start; i<=last; i++){
            if (array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }
    private void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}

class Main{
    public static void main(String[] args) {
        SelectionSort selection = new SelectionSort();
        int[] array = {5, 4, 7,0 ,8, 9, 12, 34 , 90, -1};
        selection.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
