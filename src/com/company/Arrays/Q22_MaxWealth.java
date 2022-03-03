package com.company.Arrays;
//https://leetcode.com/problems/richest-customer-wealth/
public class Q22_MaxWealth {
    public static void main(String[] args) {
    int accounts[][] = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int accounts[][]){
        int ans =Integer.MIN_VALUE;

        //i=row
        //j 0r account=col
        for (int[] account : accounts) {
            //when we start new col, take a new sum of that row.
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
