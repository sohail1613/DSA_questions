//For a given matrix of N x M, print its transpose.

package com.company.Arrays;

import java.util.Scanner;

public class Q10_TransposeMatrix {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Enter rows :");
        int rows = aa.nextInt();
        System.out.print("Enter columns :");
        int columns = aa.nextInt();

        //array declaration
        int matrix[][] = new int[rows][columns];

        //elements input
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                matrix[i][j] = aa.nextInt();
            }
        }

        //To print transpose of matrix.
        System.out.println("Transpose of matrix is :");

        for (int j=0; j<columns; j++){
            for (int i=0; i<rows; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
