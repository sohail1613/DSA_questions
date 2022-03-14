package com.company.BinarySearch;
//https://leetcode.com/problems/sqrtx/
public class Q5_Square {
    public static void main(String[] args) {
        int x=8192;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        int left = 1, right = x/2;
        while ( left <= right) {
            int mid = (left + right) /2;
            if (mid > x /mid) {
                right = mid - 1;
                continue;
            }
            if ((mid+1) <= x/(mid+1)) {
                left = mid + 1;
                continue;
            }
            return mid;
        }
        return x;
    }
}
