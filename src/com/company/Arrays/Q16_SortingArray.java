//Sort the array of 0s, 1s, and 2s.
//https://www.javatpoint.com/sort-an-array-of-0s-1s-and-2s

package com.company.Arrays;

import java.util.Scanner;

public class Q16_SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        //array
        int array[] = new int[size];

        //input from user at each index.
        for (int i=0; i<size; i++){
            System.out.print("Enter element: ");
            array[i] = sc.nextInt();
        }

        sortArray(array, size);
        System.out.print("Sorted array: ");
        for (int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void sortArray( int array[], int number){
        int countZero=0;
        int countOne=0;
        int countTwo=0;

        int i=0;

        while (i<number){
            if (array[i] == 0){
                countZero += 1;
            }

            if (array[i] == 1){
                countOne += 1;
            }

            if (array[i] == 2){
                countTwo += 1;
            } i++;
        } i=0;

        while (i<countZero){
            array[i]=0;
            i++;
        }
        while (i<countOne + countZero){
            array[i] = 1;
            i++;
        }
        while (i<countTwo + countOne + countZero){
            array[i] = 2;
            i++;
        }
    }
}
