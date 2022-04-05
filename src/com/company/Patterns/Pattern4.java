//Print pattern
//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5

package com.company.Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int number){
        //outer loop
        for (int i=1; i<= number; i++){
            //inter loop
            for (int j= 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
