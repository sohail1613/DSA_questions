//Find the product of the given digits

package com.company.Basic;

import java.util.Scanner;

public class Q22_ProductsOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();
        int product=1; // not zero cause multiplying with will make it zero

        while (number!=0){
            product=product*(number%10);
            number=number/10;
        }
        System.out.println("The product of digits is :"+product);
    }
}
