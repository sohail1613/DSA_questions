//print these pattern
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *

package com.company.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        patter5(5);
    }

    static void patter5(int star){
        //upper part
       for (int i=0; i<= star; i++){
           for (int j=1; j<=i; j++){
               System.out.print("* ");
           }
           System.out.println();
       }
        //lower part
        for (int i=star-1; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
