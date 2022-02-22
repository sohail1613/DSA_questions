//Find the occurrence of an integer in the array.
//Approach:
//Enter size of array and then enter all the elements of that array. Now enter the element of which you
// want to count occurrences. With the help of for loop now we can easily calculate number of occurrences
// of the given element.

package com.company.Arrays;

import java.util.Scanner;

public class Q15_ElementOccurence {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        int count=0, number;
        System.out.print("Enter size of array :");
        int size = sa.nextInt();

        //array
        int array[] = new int[size];

        //input from user for each index.
        for (int i=0; i<size; i++){
            System.out.print("Enter value: ");
            array[i] = sa.nextInt();
        }

        System.out.print("Enter number to count it's occurrence: ");
        number= sa.nextInt();

        //counting occurrence of elements.
        for (int i=0; i< array.length; i++){
            if (array[i] == number){
                count++;
            }
        }
        System.out.println("Total number of occurrence in array is: "+count);
    }
}
