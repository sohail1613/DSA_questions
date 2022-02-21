//Reverse Array

package com.company.Arrays;

import java.util.Scanner;

public class Q12_ReverseArray {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int size = aa.nextInt(); //size of array

        int array[] = new int[size];  //array

        //input from user for each index
        System.out.println("Original array is :");
        for (int i=0; i<size; i++){
            array[i] = aa.nextInt();
        }

        //reverse array
        System.out.print("Reversed array is: ");
        for (int i= array.length-1; i>=0; i--){ //starting from last and iterate till 1st.
            System.out.print(array[i]+" ");
        }
    }
}