package com.company.BinarySearch;
//https://leetcode.com/problems/kth-missing-positive-number/discuss/1854787/Easy
//Approach: Increasing ordered array
public class Q10_MissingPositive {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(array, k));
    }

    public static int findKthPositive(int arr[], int k){
//        if every element in the array > k , the answer would be k.
//        So, for every element <= k
//        we need to increment k. And since the array is in increasing order, you can break out
//        of the loop on the first instance this condition fails.
        for (int i : arr){
            if (i <= k) k++;
            else break;
        }
        return k;
    }
}
