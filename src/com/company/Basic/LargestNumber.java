//take 3 numbers input from user and print largest number
//syntax:    variable_name = (expression) ? value if true:value if false
package com.company.Basic;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int temp, largest;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number1 here :");
        int number1= sc.nextInt();
        System.out.print("Enter number2 here :");
        int number2= sc.nextInt();
        System.out.print("Enter number3 here :");
        int number3= sc.nextInt();

        //comparing a and b and storing the largest number in a temp variable
        temp=number1>number2?number1:number2;
        //comparing the temp variable with c and storing the result in the variable
        largest=number3>temp?number3:temp;
        System.out.println("Largest number is : "+largest);
    }
}
