//Write a program to reverse the given string

package com.company.Basic;

import java.util.Scanner;

public class Q13_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to get reverse :");
        String name = sc.nextLine();
        String reverse="";
        char ch;

        for (int i=0; i<name.length(); i++){
            ch=name.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println("Given word is :"+name);
        System.out.println("Reversed string is :"+reverse);
    }
}
