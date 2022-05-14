package com.company.Basic;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //ternary operator
        int answer = (num1>num2) ? (num1+num2):(num1-num2);
        System.out.println(answer);
    }
}
