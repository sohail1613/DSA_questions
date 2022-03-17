package com.company.BinarySearch;
//https://leetcode.com/problems/intersection-of-two-arrays/submissions/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q14_ArraysIntersection {
    public static void main(String[] args) {
       int nums1[] = {1,2,2,1};
       int nums2[] = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

        System.out.println(Arrays.toString(intersectionSecond(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList <Integer> res = new ArrayList<Integer>();

        for(int i=0; i<nums1.length; i++) set.add(nums1[i]);
        for(int j=0; j<nums2.length; j++){
            // If present in array 2 then add to res and remove from set
            if(set.contains(nums2[j])){
                res.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }

        //convert ArrayList to array
        int array[] = new int[res.size()];
        for(int i=0; i<res.size(); i++) array[i] = res.get(i);
        return array;
    }

//    https://leetcode.com/problems/intersection-of-two-arrays-ii/
//    Problem:
//    Given two integer arrays nums1 and nums2, return an array of their intersection.
//    Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
    public static int[] intersectionSecond(int[] nums1, int[] nums2) {
        if(nums1.length==0)
            return nums1;
        if(nums2.length==0)
            return nums2;

        //sorting arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0,k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j] )
                i++;
            else if(nums2[j]<nums1[i])
                j++;
            else if(nums1[i]==nums2[j]){
                nums1[k++]=nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
