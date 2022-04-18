package com.dsa.questions.arrays;

public class Questions {
//    //Q1_Build Array from Permutation
//    public int[] buildArray(int[] arr){
//        int ans[] = new int[arr.length];
//        for (int i = 0; i < arr.length ; i++) {
//            ans[i] = arr[arr[i]];
//        }
//        return ans;
//    }

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
}
