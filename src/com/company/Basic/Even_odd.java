package com.company.Basic;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number=sc.nextInt();

        if (number%2==0){
            System.out.println("It is a even number :"+number);
        } else {
            System.out.println("It's odd number :"+number);
        }
    }
}
