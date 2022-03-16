package com.company.BinarySearch;
//https://leetcode.com/problems/arranging-coins/discuss/1853957/Simple

public class Q8_ArrangingCoins {
    public static void main(String[] args) {
        int number = 8;
        System.out.println(arrangeCoins(number));
    }

    public static int arrangeCoins(int n) {
        long low=1, high=n;
        
        while(low <= high){
            long mid = low+(high-low)/2;
            long sum = mid*(mid+1)/2;

            if(sum == n){
                return (int)mid;
            } else if(sum<n){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return (int)high;
    }
}
