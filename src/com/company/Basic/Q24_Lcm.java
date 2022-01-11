//find lcm without gcd

package com.company.Basic;

import java.util.Scanner;

public class Q24_Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int a= sc.nextByte();
        int b= sc.nextByte();

        int large=Math.max(a,b);
        int small=Math.min(a,b);

        for (int i=large; ; i=i+large){
            return;
        }
        System.out.println("LCM of "+a+" and "+b+" is :");
    }
}
