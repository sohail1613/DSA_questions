package com.company.BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// we will follow same approach like ceiling mentioned below
//https://github.com/sohail1613/DSA_questions/blob/main/src/com/company/BinarySearch/Q2_Ceiling.java

public class Q9_SmallestLetter {
    public static void main(String[] args) {
        char letter[] = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letter, target));
    }

    public static char nextGreatestLetter(char letter[], char target){
        int start = 0;
        int end = letter.length-1;

        while(start <= end){
            //find the middle element
            //int mid = (start + end)/2;
            //might be possible that (start + end) exceeds the range of int in java
            int mid = start+(end - start)/2;
            if (target < letter[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }
}
