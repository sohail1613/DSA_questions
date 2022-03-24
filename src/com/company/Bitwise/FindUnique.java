package com.company.Bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int array[] = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(array));
    }

    private static int ans(int[] array) {
        int unique=0;
        for (int n: array){
            unique ^= n; //using XOR gate (Exclusive OR)
        }

        return unique;
    }
}
