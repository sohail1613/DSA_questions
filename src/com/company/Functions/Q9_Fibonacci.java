package com.company.Functions;

import java.util.Scanner;

public class Q9_Fibonacci {
    public static int calculateFibonacciSeries(int number){
        int term1=0;
        int term2=1;
        int term3;
        System.out.println("Fibonacci series of "+number+" is :");
        System.out.print(term1+" "+term2);

        for (int i=2; i<=number; i++){
            term3=term1+term2;
            System.out.print(" "+term3);
            term1=term2;
            term2=term3;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for fibonacci series :");
        int number= sc.nextInt();

        int term3=calculateFibonacciSeries(number);
    }
}
