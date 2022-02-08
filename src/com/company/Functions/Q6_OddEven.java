//Check the given number is odd or even using function.

//Even = completely divisible by 2
//Odd = not divisible by 2

package com.company.Functions;

import java.util.Scanner;

public class Q6_OddEven {
    public static int checkOddEven(int number){
        if (number%2==0){
            System.out.println("Given number is even :"+number);
        } else {
            System.out.println("Given number is odd :"+number);
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number = sc.nextInt();

        checkOddEven(number);   //call kiya function ko
    }
}
