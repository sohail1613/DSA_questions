package com.company.BinarySearch;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class Q6_TwoSum {
    public static void main(String[] args) {
        int number[] = {2, 7, 11, 15};
        int target = 9;
        int answer[] = twoSum(number, target);
        System.out.println(answer);
    }

    public static int[] twoSum(int numbers[], int target){
        int firstindex = 0;
        int secondindex = numbers.length-1;
        while(numbers[firstindex] + numbers[secondindex] != target){
            if (numbers[firstindex] + numbers[secondindex] > target) secondindex--;
            else firstindex++;
        }
        return new int[]{firstindex+1, secondindex+1};
    }
}
