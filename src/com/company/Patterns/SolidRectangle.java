//    *****
//    *****
//    *****
//    *****
//    *****

package com.company.Patterns;

public class SolidRectangle {
    public static void main(String[] args) {
        pattern1(5);
    }

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
