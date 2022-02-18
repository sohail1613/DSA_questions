//Print the spiral order matrix as output for a given matrix of numbers.

package com.company.Arrays;

import java.util.Scanner;

public class Q9_SpiralMatrix {
    public static void main (String[] args) {
        Scanner aa = new Scanner(System.in);
        int rows = aa.nextInt();
        int cols = aa.nextInt();

        int matrix[][] = new int[rows][cols];

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrix[i][j]= aa.nextInt();
            }
        }
        System.out.println("Spiral matrix order is :");

        int rowStart=0;
        int rowEnd=rows-1;
        int colStart=0;
        int colEnd=cols-1;

        //spiral order matrix.
        while (rowStart <= rowEnd && colStart <= colEnd){
            //1
            for (int i=colStart; i<=colEnd; i++){
                System.out.print(matrix[rowStart][i]+" ");
            }
            rowStart ++;

            //2
            for (int i=rowStart; i<=rowEnd; i++){
                System.out.print(matrix[i][colEnd]+" ");
            }
            colEnd --;

            //3
            for (int i=colEnd; i>=colStart; i--){
                System.out.print(matrix[rowEnd][i]+" ");
            }
            rowEnd --;

            //4
            for (int i=rowEnd; i>=rowStart; i--){
                System.out.print(matrix[i][colStart]+" ");
            }
            colStart ++;

        }
    }
}
