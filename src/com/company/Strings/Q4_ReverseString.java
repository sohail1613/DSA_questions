//Reverse string (using Srting Builder).

package com.company.Strings;

import java.util.Scanner;

public class Q4_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter world :");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder(word);

        for (int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1 -i;  //5-1-0 => 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("Reversed String is: "+sb);
    }
}
