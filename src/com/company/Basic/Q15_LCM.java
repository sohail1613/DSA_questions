//LCM of 2 numbers

package com.company.Basic;

import java.util.Scanner;

public class Q15_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gcd=1;
        int number1= sc.nextInt();
        int number2= sc.nextInt();

        for (int i=1; i<=number1 && i<=number2; ++i){
            if (number1%i==0 && number2%i==0)
                gcd=i;
        }
        int lcm=(number1*number2)/gcd;
        System.out.println("The lcm of "+number1+" and "+number2+" is : "+lcm);
    }
}
