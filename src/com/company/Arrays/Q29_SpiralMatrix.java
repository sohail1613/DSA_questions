package com.company.Arrays;

import java.util.Arrays;

public class Q29_SpiralMatrix {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    public static int[][] generateMatrix(int n) {
        //https://www.youtube.com/watch?v=1ZGJzvkcLsA&ab_channel=TECHDOSE
        int top =0 , bottom=n-1, left=0, right=n-1, direction=0;
        int[][] matrix = new int[n][n];
        int num=1;

        while(left<=right && top<=bottom){
            if (direction==0){
                for (int i=left; i<=right; i++){
                    matrix[top][i] = num;
                    num++;
                }
                top++;
            } else if (direction==1) {
                for (int i=top; i<=bottom; i++){
                    matrix[i][right] = num;
                    num++;
                }
                right--;
            } else if (direction==2) {
                for (int i=right; i>=left; i--){
                    matrix[bottom][i] = num;
                    num++;
                }
                bottom--;
            } else if (direction==3) {
                for (int i=bottom; i>=top; i--){
                    matrix[i][left] = num;
                    num++;
                }
                left++;
            }
            direction = (direction+1)%4;
        }
        return matrix;
    }
}
