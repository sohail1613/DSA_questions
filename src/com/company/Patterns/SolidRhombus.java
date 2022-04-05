
package com.company.Patterns;

public class SolidRhombus {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int star){
        for(int i=1; i<=star; i++){
            //printing spaces
            for (int j=0; j<=star-i; j++){
                System.out.print(" ");
            }
            //printing star
            for (int j=0; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
