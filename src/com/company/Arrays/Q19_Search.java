package com.company.Arrays;

public class Q19_Search {
    public static void main(String[] args) {
        int nums[] = {23, 45, 7, 8, 9, 34, 90, -5, -3, 90, 11};
        int target = 9;
        System.out.println(lenearSearch(nums, target));
    }
    
    public static int lenearSearch(int arr[], int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int i=0; i< arr.length; i++){
            //check for element at every index if it is = target
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        //if none will execute
        return -1;
    }
}
