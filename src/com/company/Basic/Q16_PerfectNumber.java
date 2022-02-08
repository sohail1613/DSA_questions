//Find perfect number.
//example 6: 1+2+3=6 (perfect number)
//10: 1+2+5=8 (Not perfect number)

package com.company.Basic;

import java.util.Scanner;

public class Q16_PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number= sc.nextInt();
        int sum=0;

        if (number>0){

            for (int i=1; i<number; i++){
                if (number%i==0){ //if completely divisible then add i value in sum
                    sum=sum+i;    // add and store value in sum
                }
            }

            if (number==sum){ // comparing number and sum
                System.out.println("Given number is a perfect number :"+number);
            } else {
                System.out.println("Given number is not perfect :"+number);
            }
        } else {
            System.out.println("Enter positive number only.");
        }
    }
}
