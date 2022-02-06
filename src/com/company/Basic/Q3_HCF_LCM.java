//Find HCF and LCM (without using GCD)

package com.company.Basic;

import java.util.Scanner;

public class Q3_HCF_LCM {
    public static void main(String[] args) {
        int number1, number2,temp,temp1,temp2, hcf, lcm;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number :");
        number1 = sc.nextInt();
        System.out.print("Enter second number :");
        number2 = sc.nextInt();

        temp1 = number1;
        temp2 = number2;

        while (temp2!=0){
            temp=temp2;
            temp2= temp1%temp2;
            temp1=temp;
        }

        hcf=temp1;
        lcm = (number1*number2)/hcf;
        System.out.println("HCF is :"+hcf);
        System.out.println("LCM is :"+lcm);
    }
}
