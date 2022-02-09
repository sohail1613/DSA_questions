//write program to print name using function

package com.company.Functions;

import java.util.Scanner;

public class Q3_Name {
    public static void printMyName(String name){
        System.out.print("Name is :"+name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");
        String name = sc.nextLine();

        printMyName(name);
    }
}
