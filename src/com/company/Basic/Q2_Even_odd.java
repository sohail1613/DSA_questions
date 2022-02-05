//Find Even and odd numbers.
//https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/

package com.company.Basic;

import java.util.Scanner;

public class Q2_Even_odd {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // System.out.print("Enter number :");
       // int number=sc.nextInt();
        for (int i=1; i<100; i++){
        if (i%2==0){
            System.out.println("It is a even number :"+i);
        } //else {
           // System.out.println("It's odd number :"+number);
        }
    }
}
