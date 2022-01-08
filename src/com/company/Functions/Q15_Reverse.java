//Write a program to reverse string

package com.company.Functions;

import java.util.Scanner;

public class Q15_Reverse {
    public static void printReverseString(String name){
        String reverse="";
        char ch;

        for (int i=0; i<name.length(); i++){
            ch=name.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println("Reversed String is :"+reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to get reverse :");
        String name= sc.nextLine();

        printReverseString(name);
    }
}
