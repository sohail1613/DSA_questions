//https://leetcode.com/problems/plus-one/

package com.company.Arrays;

public class Q28_PlusOne {
    public static void main(String[] args) {
        int digits[] ={1, 2, 3};
        System.out.println(plusOne(digits));

    }
    public static int[] plusOne(int digits[]){
        for (int i= digits.length-1; i>=0; i++){
            if (digits[i] != 0){
                digits[i] ++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0){
            int array[] = new int[digits.length+1];
            array[0] = 1;
            return array;
        }
        return digits;
    }
}
