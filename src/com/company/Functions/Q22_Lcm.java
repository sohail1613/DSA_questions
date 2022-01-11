package com.company.Functions;

import java.util.Scanner;

public class Q22_Lcm {
    public static int LCM(int a, int b){
        int large=Math.max(a,b);
        int small=Math.min(a,b);

        for (int i=large; ; i=i+large){
            if (i%small==0)
                return  i;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextByte();
        int b= sc.nextByte();

        System.out.println("LCM of "+a+" and "+b+" is :"+LCM(a,b));
    }
}
