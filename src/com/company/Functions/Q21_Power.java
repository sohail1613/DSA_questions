//Write power program using function (input from user)

package com.company.Functions;

import java.util.Scanner;

public class Q21_Power {
    public static int power(int base, int exponent){
        int power=1;
        for (int i=1; i<=exponent; i++){
            power=power*base;
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value :");
        int base= sc.nextInt();
        System.out.print("Enter exponent value :");
        int exponent= sc.nextInt();

        System.out.println(power(base, exponent));
    }
}
