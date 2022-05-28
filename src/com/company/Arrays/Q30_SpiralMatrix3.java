package com.company.Arrays;

import java.util.Arrays;

//885. Spiral Matrix III
//https://leetcode.com/problems/spiral-matrix-iii/
public class Q30_SpiralMatrix3 {
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] matrix =new int[rows*cols][2];
        int i = 0;
        matrix[i++] = new int[]{rStart, cStart};
        int len = 0, d=0;
        int[] direction = new int[]{0,1,0,-1,0};

        while(i < rows*cols){
            if (d==0 || d==2){
                len++;
            }
            for (int j=0; j<len; j++){
                rStart += direction[d];
                cStart += direction[d+1];
                if (rStart<rows && rStart>=0 && cStart<cols && cStart>=0){
                    matrix[i++] = new int[]{rows, cols};
                }
            }
            d = ++d % 4;
        }
        return matrix;
    }

    public static void main(String[] args) {
       int rows = 5, cols = 6, rStart = 1, cStart = 4;
        System.out.println(Arrays.deepToString(spiralMatrixIII(5, 6, 1, 4)));
    }
}
