package com.company.Arrays;

public class Q33_CustomerWealth {
    public static int maximumCustomerWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        //for each amount value in account
        for (int[] account: accounts) {
            int sum = 0; // when we start new col take new sum.
            for (int i : account){
                sum += i;
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
         int[][] accounts = {{1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}};
         int ans = maximumCustomerWealth(accounts);
         System.out.println(ans);
    }
}
