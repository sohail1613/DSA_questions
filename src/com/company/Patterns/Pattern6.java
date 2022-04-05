//print pattern
//         *
//        **
//       ***
//      ****
//     *****

package com.company.Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int star){
        for(int i=star; i>=1; i--){
            //printing spaces
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            //printing star
            for (int j=0; j<=star-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
