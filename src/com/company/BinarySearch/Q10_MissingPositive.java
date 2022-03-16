package com.company.BinarySearch;
//https://leetcode.com/problems/kth-missing-positive-number/discuss/1854787/Easy
public class Q10_MissingPositive {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(array, k));
    }

    public static int findKthPositive(int arr[], int k){
        for (int i : arr){
            if (i <= k) k++;
            else break;
        }
        return k;
    }
}
