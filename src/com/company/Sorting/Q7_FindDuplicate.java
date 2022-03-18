package com.company.Sorting;
//asked in Amazon and Microsoft
public class Q7_FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 2};
        findDuplicate(arr);
        System.out.println(findDuplicate(arr));

    }

    public static int findDuplicate(int[] arr){
        int i=0;
        while(i < arr.length){
            if (arr[i] != i+1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                } else{
                    return arr[i];
                }
            } else{
                i++;
            }
        }
        return -1;
    }

    //swapping
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
