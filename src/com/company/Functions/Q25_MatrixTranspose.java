package com.company.Functions;

public class Q25_MatrixTranspose {
    public static void main(String[] args) {
        int rows=2, columns=3;
        int matrix[][]={{1,2,3},{4,5,6}};
        System.out.println("Original Matrix: ");
        matrix(matrix); //call kiya function ko.

        int transpose[][]=new int[columns][rows];
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("Transposed Matrix: ");
        matrix(transpose); // call kiya function ko.
    }

    public static void matrix(int matrix[][]){

        for (int row[]:matrix){
            for (int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
