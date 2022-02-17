package com.company.Arrays;

import java.util.Scanner;

public class Q7_2D_Array {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int rows= aa.nextInt();
        int cols= aa.nextInt();

        int numbers[][] = new int[rows][cols];

        //input
        //rows
        for (int i=0; i<rows; i++){
            //columns
            for (int j=0; j<cols; j++){
                numbers[i][j]= aa.nextInt();
            }
        }

        //output
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
