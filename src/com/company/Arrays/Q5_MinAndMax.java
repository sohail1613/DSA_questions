//Find the maximum & minimum number in an array of integers.
//[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

package com.company.Arrays;

import java.util.Scanner;

public class Q5_MinAndMax {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size= aa.nextInt();

        //array
        int number[] = new int[size];

        //input and storing at index i.
        for (int i=0; i<size; i++){
            System.out.print("Enter numbers :");
            number[i] = aa.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for (int i=0; i< number.length; i++){
            //applying if condition.
            if (number[i]>max){
                max = number[i];
            }

            if (number[i]<min){
                min = number[i];
            }
        }

        System.out.println("Largest numbers is : "+max);
        System.out.println("Smallest number is : "+min);
    }
}
