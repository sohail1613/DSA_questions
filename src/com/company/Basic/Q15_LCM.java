//LCM of 2 numbers

package com.company.Basic;

import java.util.Scanner;

public class Q15_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int number1= sc.nextInt();
        System.out.print("Enter second number :");
        int number2= sc.nextInt();

        int a=number1;
        int b= number2;

        while (b!=0){
            int t=a;
            b=a%b;
            a=t;
        }
        int hcf=a;
        int lcm=(number1*number2)/hcf;
        System.out.println("HCF is: "+hcf);
        System.out.println("The lcm of "+number1+" and "+number2+" is : "+lcm);
    }
}
