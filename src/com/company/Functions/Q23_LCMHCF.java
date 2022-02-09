//Find lcm and hcf is the given input.(input from user)

package com.company.Functions;

import java.util.Scanner;

public class Q23_LCMHCF {
    public static void LCMHCF(int number1, int number2){
        int temp1=number1;
        int temp2=number2;
        int lcm, hcf, temp;

        while (temp2!=0){
            temp=temp2;
            temp2=temp1%temp2;
            temp1=temp;
        }

        hcf=temp1;
        lcm=(number1*number2)/hcf;

        System.out.println("HCF of "+number1+" and "+number2+" is :"+hcf);
        System.out.println("LCM of "+number1+" and "+number2+" is :"+lcm);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int number1= sc.nextInt();
        System.out.print("Enter second number :");
        int number2= sc.nextInt();
        int lcm, hcf;

        LCMHCF(number1, number2);

    }
}
