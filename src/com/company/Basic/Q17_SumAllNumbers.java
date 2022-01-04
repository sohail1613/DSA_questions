package com.company.Basic;

import java.util.Scanner;

public class Q17_SumAllNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;  //initial value of sum

        while (true){
            System.out.print("Enter numbers :");
            int number= sc.nextInt();

            //terminating condition on pressing 0
            if (number==0)
                break;
            else {
                sum=sum+number;
            }
        }
        System.out.println("The total sum of all numbers is :"+sum);
    }
}
