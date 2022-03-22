//Print all possible patterns, questions link below
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

package com.company.Patterns;

public class SolidRectangle {
    public static void main(String[] args) {
        System.out.println("Solid Rectangle");
        pattern1(5); //solid rectangle
        System.out.println("Solid Half Triangle");
        pattern2(5); //Sold half triangle.
        System.out.println("Solid Inverted Half Triangle");
        pattern3(5); //Inverted solid pyramid
        System.out.println("Numerical half triangle");
        pattern4(5); //Numerical half triangle
    }

    private static void pattern3(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j=0; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int i=0; i<=n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
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
