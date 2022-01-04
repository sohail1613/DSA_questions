//Find factorial of number n

package com.company.Basic;

import java.util.Scanner;

public class Q9_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get it's Factorial :");
        int number = sc.nextInt();
        System.out.print("The Factorial is :");
        int factorial=1;

        for (int i=1; i<=number; i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial is "+factorial);
    }
}
