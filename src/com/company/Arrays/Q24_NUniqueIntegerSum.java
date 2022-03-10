//Find N Unique Integers Sum up to Zero

package com.company.Arrays;

public class Q24_NUniqueIntegerSum {
    public static void main(String[] args) {
        int array[] = sumZero(5);
        for (int i=0; i<5; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static int[] sumZero(int n){
        int[] result = new int[n];
        for (int i=0; i<n-1; i=i+2){
            result[i]=i+1;
            result [i+1] = -(i+1);
        }
        return result;
    }
}
