//Reshape matrix
//https://leetcode.com/problems/reshape-the-matrix/

package com.company.Arrays;

public class Q27_ReshapeMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2},{3,4}};
        int row=1;
        int col=4;

        System.out.println(matrixReshape(matrix, row, col));
    }

    public static int[][] matrixReshape(int[][] matrix, int r, int c){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if ((rows*cols) != (r*c))
            return matrix;

        //creating new matrix
        int[][] answer = new int[r][c];
        int answer_rows = 0;
        int answer_cols = 0;

        //Traversing on matrix
        for (int[] ints : matrix) {
            for (int j = 0; j < cols; j++) {
                answer[answer_rows][answer_cols] = ints[j];
                answer_cols++;

                if (answer_cols == c) {
                    answer_cols = 0;
                    answer_rows++;
                }
            }
        }
        return answer;
    }
}
