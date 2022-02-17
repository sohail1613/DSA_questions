//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

package com.company.Arrays;

import java.util.Scanner;

public class Q8_Matrix {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int rows = aa.nextInt();
        int cols = aa.nextInt();

        int numbers[][] = new int[rows][cols];

        //input
        //rows
        for (int i=0; i<rows; i++){
            //columns
            for (int j=0; j<cols; j++){
                numbers[i][j]=aa.nextInt();
            }
        }

        System.out.print("Enter number to search :");
        int x = aa.nextInt();

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (numbers[i][j] == x){
                    System.out.println("x found at index ("+i+", "+j+")");
                }
            }
        }
    }
}
