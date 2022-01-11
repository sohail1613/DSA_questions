//Find lcm without using gcd (input from user)

package com.company.Functions;

import java.util.Scanner;

public class Q22_Lcm {
    public static int LCM(int number1, int number2){
        int large=Math.max(number1,number2);
        int small=Math.min(number1,number2);

        for (int i=large; ; i=i+large){
            if (i%small==0)
                return  i;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number1 = sc.nextByte();
        int number2= sc.nextByte();

        System.out.println("LCM of "+number1+" and "+number2+" is :"+LCM(number1,number2));
    }
}
