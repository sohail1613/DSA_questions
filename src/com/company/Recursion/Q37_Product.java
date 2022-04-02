package com.company.Recursion;

public class Q37_Product {
    public static void main(String[] args) {
        System.out.println(productOfTwo(5, 2));
    }

    static int productOfTwo(int x, int y){
        //base condition
        if (x == 0 || y == 0){
            return 0;
        }

        if(x < y){
            return productOfTwo(x, y);
        } else {
            return (x + productOfTwo(x, y-1));
        }
    }
}
