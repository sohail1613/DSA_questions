package com.company.Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int star){
        for (int i=0; i<=star; i++){
            //printing space
            for (int j=0; j<=i; j++){
                System.out.print(" ");
            }
            //printing star
            for (int j=i; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
