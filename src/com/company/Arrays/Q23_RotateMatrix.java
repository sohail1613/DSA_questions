package com.company.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class Q23_RotateMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{0, 1},{1, 0}};
        int target[][] =  {{1, 0},{0, 1}};
        boolean reversed= findRotation(matrix, target);
        System.out.println(reversed);
    }

    static boolean findRotation(int matrix[][], int target[][]){
        int reverse[][] = new int[matrix.length][matrix.length];
        //rotate 90 degree clockwise
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix.length; j++){
                reverse[i][j] = matrix[matrix.length-1-i][j];
            }
        }

        int reverse2[][] = new int[matrix.length][matrix.length];
        //rotate 180 degree clockwise
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix.length; j++){
                reverse2[i][j] = reverse[matrix.length-j-1][i];
            }
        }

        int reverse3[][] = new int[matrix.length][matrix.length];
        //rotate 270 degree in clockwise
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix.length; j++){
                reverse3[i][j] = reverse2[matrix.length-j-1][i];
            }
        }

        //compare rotations and itself
        if (Arrays.deepEquals(target, reverse) || Arrays.deepEquals(target, reverse2) || Arrays.deepEquals(target, reverse3) || Arrays.deepEquals(target, matrix)){
            return true;
        }
        return false;
    }
}
