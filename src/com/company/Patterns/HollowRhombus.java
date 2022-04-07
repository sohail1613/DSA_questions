package com.company.Patterns;

public class HollowRhombus {
    public static void main(String[] args) {
        hollowRhombus(5);
    }

    static void hollowRhombus(int number){
        for (int i=0; i<=number; i++){
            //spaces
            for (int j=0; j<=number-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=0; j<=number; j++){
                if (i==0 || j==0 || i==number || j==number){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
