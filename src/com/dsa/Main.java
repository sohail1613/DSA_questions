package com.dsa;

import com.dsa.questions.Basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Basics basics = new Basics();
        Scanner sc = new Scanner(System.in);
//        float res = basics.average(2,3,5);
//        System.out.println(res);
//
//        double answer = basics.circleArea(5);
//        System.out.println("Area :"+ answer);
//        double answer1 = basics.circleParameter(5);
//        System.out.println("Perimeter is :"+answer1);
//
//        double answer2 = basics.simpleInterest(1000, 9, 4);
//        System.out.println("Simple interest : "+answer2);
//
//        double answer3 = basics.compoundInterest(2000, 7, 4);
//        System.out.println("Compound Interest :"+answer3);
//
//        basics.swap(10, 20);
//
//        basics.oddEven(234);

        // Switch case //
//        Scanner sc = new Scanner(System.in);
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//        String operator = sc.next();
//
//         int ans = basics.arithmetic(number1, number2, operator);
//        System.out.println(ans);

//        int ans = basics.power1(5);
//        System.out.println("ans");

//        //Q8 calculating commision
//        Scanner sc = new Scanner(System.in);
//        int sales = sc.nextInt();
//        int age = sc.nextInt();
//        float ans = basics.Q8_commision(sales, age);
//        System.out.println("Commission :"+ans);
//    }

//        Q10_find factorial
//        Scanner fb = new Scanner(System.in);
//        int number = fb.nextInt();
//        int fact = basics.Q10_factorial(number);
//        System.out.println("factorial is : " + fact);

//        Q13_fibonacci series
//        Scanner fibo = new Scanner(System.in);
//        int number = fibo.nextInt();
//        basics.Q13_fibonacciSeries(number);

        //Q16 GCD or HCF
//        Scanner sc = new Scanner(System.in);
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//        int gcd = basics.Q16_gcd(number1, number2);
//        System.out.println(gcd);


        //Q17_sum of digits
//        int number = sc.nextInt();
//        int answer = basics.Q17_digitSum(number);
//        System.out.println(answer);

//        Q18 reverse number
//        int number = sc.nextInt();
//        int answer = basics.Q18_reverse(number);
//        System.out.println(answer);

//        Q19 check palindrome
//        int number = sc.nextInt();
//        int answer = basics.Q19_palindrome(number);
//        System.out.println(answer);

//        Q20_ Find Smallest number.
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//        int number3 = sc.nextInt();
//        int smallest = basics.Q20_smallestNumber(number1, number2, number3);
//        System.out.println(smallest);

//        Q20 find Largest number
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//        int number3 = sc.nextInt();
//        int largest = basics.Q20_largestNumber(number1, number2, number3);
//        System.out.println(largest);

//        Q21_print prime number between intervals
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        for (int i=number1; i<= number2; i++){
            if (basics.Q21_isPrime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
