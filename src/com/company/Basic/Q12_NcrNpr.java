//Find nCr and nPr

package com.company.Basic;

import java.util.Scanner;

public class Q12_NcrNpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //asking total number from user
        int r= sc.nextInt(); //asking how many times number used from user
        int combination, permutation;

        //calculating factorial of n
        for (int i =1; i<=n; i++){
            n=n*i;
        }

        //calculating factorial of r
        for (int i=1; i<=r; i++){
            r=r*i;
        }

        //calculating (n-r)
        int j =n-r;  // because first we should subtract the perform action on it
        for (int i=1; i<=j; i++){
            j=j*i; //it will give (n-r)!
        }

        //combination nCr
        combination=n/r*(j);
        System.out.println("The nCr is:"+combination);

        //permutation
        permutation=n/j;
        System.out.println("The nPr is :"+permutation);
    }
}
