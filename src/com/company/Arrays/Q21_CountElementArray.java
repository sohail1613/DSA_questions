package com.company.Arrays;

public class Q21_CountElementArray {
    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7865, 905354};
        System.out.println(findNumber(nums));
    }

    public static int findNumber(int [] nums){
        int count=0;
        for (int num:nums){
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    private static int digits(int num) {
        int count = 0;
        while(num>0){
            num /= 10;
            count++;
        }
        return count;
    }
}
