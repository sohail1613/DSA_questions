package com.company.Basic;

import java.util.Scanner;

public class Q11_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;  //initial value
        System.out.print("Enter number to get sum :");
        int number = sc.nextInt();

        for (int i=1; i<=number; i++){
            sum=sum+i;    // add sum+i and store in sum
        }
        // Finally, print total value
        System.out.println("Sum of the "+number+" is :"+sum);
    }
}
