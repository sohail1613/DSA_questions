//Take an array of names as input from the user and print them on the screen.

package com.company.Arrays;

import java.util.Scanner;

public class Q4_PrintName {
    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = eb.nextInt();

        //array
        String name[] = new String[size];

        //input from user for each index.
        for (int i=0; i<size; i++){
            System.out.print("Enter names : ");
            name[i] = eb.next();
        }


        //output
        for (int i=0; i< name.length; i++){
            System.out.println("Name at index "+i+" is: "+name[i]);
        }
    }
}
