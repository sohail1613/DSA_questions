// write power program

package com.company.Basic;

import java.util.Scanner;

public class Q10_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base :");
        int base = sc.nextInt();
        System.out.print("Enter exponent :");
        int exponent= sc.nextInt();

        long power=1;
        //executes until the condition false
        while (exponent!=0){
            power =power*base;
            --exponent; // because will decrease everytime
        }
        System.out.println("The total value is :"+power);
    }
}
