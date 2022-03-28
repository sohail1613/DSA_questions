package com.company.Recursion;

import java.util.Arrays;

public class Q18_Pattern1 {
    public static void main(String[] args) {
        pattern(4, 0);
        triangle(4, 0);
        System.out.println();
        int array[]={4, 3, 2, 1};
        bubble(array, array.length-1, 0);
        System.out.println(Arrays.toString(array));

        selection(array, array.length, 0, 0);
        System.out.println(Arrays.toString(array));
    }

    static void pattern(int row, int col){
        if (row == 0){
            return;
        }

        if (col < row){
            System.out.print("* ");
            pattern(row, col+1);
        } else {
            System.out.println();
            pattern(row-1, 0);
        }
    }

    static void triangle(int row, int col){
        if (row == 0){
            return;
        }

        if (col < row){
            triangle(row, col+1);
            System.out.print("* ");
        } else{
            triangle(row-1, 0);
            System.out.println();
        }
    }


    static void bubble(int arr[], int row, int col){
        if (row == 0){
            return;
        }

        if (col<row){

            if (arr[col] > arr[col+1]){
                //swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }

            bubble(arr, row, col+1);
        } else{
            bubble(arr, row-1, 0);
        }
    }

    static void selection(int array[], int row, int col, int max){
        if (row == 0){
            return;
        }

        if (col < row){
            if (array[col] > array[max]){
                selection(array, row, col+1, col);
            } else{
                selection(array, row, col+1, max);
            }
        } else{
            int temp = array[max];
            array[max] = array[row-1];
            array[row-1] = temp;

            selection(array, row-1, 0, 0);
        }
    }
}
