//https://leetcode.com/problems/power-of-two/

package com.company.Recursion;

public class Q40_PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2147483648));
    }
    public static boolean isPowerOfTwo(int n) {
            if(n <= 0){
                return false;
            }

            return ((n&(n-1)) == 0);
    }
}
