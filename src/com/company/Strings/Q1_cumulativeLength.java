//Take an array of Strings input from the user & find the cumulative (combined)
//length of all those strings.

package com.company.Strings;

import java.util.Scanner;

public class Q1_cumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        String array[] = new String[size]; //array
        int totalLength = 0;

        for (int i=0; i<size; i++){
            System.out.print("Enter string: ");
            array[i] = sc.next();
            totalLength += array[i].length();
        }
        System.out.println("Total length of the string is :"+totalLength);

    }
}
