//Find permutation and combination (input from user)

package com.company.Functions;

import java.util.Scanner;

public class Q20_NcrNpr {
    public static void printPermutationCombination(int n, int r){
        int combination, permutation;
        //for factorial of n
        for (int i=1; i<=n; i++){
            n=n*i;
        }

        //for factorial of r
        for (int i=1; i<=r; i++){
            r=r*i;
        }

        //for (n-r) factorial.
        int j=n-r;
        for (int i=1; i<=j; i++){
            j=j*i;
        }

        //combination
        combination=n/r*(j);
        System.out.println("Combination is :"+combination);

        //permutation
        permutation=n/j;
        System.out.println("Permutation is :"+permutation);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number :");
        int n= sc.nextInt();
        System.out.print("Enter number of time used :");
        int r= sc.nextInt();

        printPermutationCombination(n, r);
    }
}
