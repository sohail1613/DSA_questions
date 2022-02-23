//Take an array of Strings input from the user & find the cumulative (combined)
//length of all those strings.
//solving using StringBuilder.

package com.company.Strings;

import java.util.Scanner;

public class Q5_CumulativeStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        String array[] = new String[size];

        //StringBuilder declaration
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter words: ");
        for (int i=0; i<size; i++){
            array[i]= sc.nextLine();
            sb.append(array[i]); //adding string value at the end of previous.
        }
        System.out.println("The complete word is: "+sb);
        System.out.println("Total length is: "+sb.length());
    }
}
