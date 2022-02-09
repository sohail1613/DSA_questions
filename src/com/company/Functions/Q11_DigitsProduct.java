package com.company.Functions;

import java.util.Scanner;

public class Q11_DigitsProduct {
    public static int printDigitsProduct(int number){
        int product=1;
        while (number!=0){
            product=product*(number%10);
            number=number/10;
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer value :");
        int number= sc.nextInt();

        //two different to call function
        int result = printDigitsProduct(number); //calling function
        System.out.println("Products of digit is :"+result);

        //we can also call directly
        //System.out.println("Products of digit is :"+printDigitsProduct(number));
    }
}
