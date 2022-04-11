package com.dsa.questions;


import java.io.FilterOutputStream;

public class Basics {

    public float Q1_Average(float a, float b, float c){
        float sum = a+b+c;
        float average = (sum / 3);
        return average;
    }

//    area and parameter of circle (given radius)
    public  double Q2_circleArea(int radius){
        double pi = 3.14;
        double area = pi*(radius*radius);
        return area;
    }
    public double Q2_circleParameter(int radius){
        double pi = 3.14;
        double perimeter = pi*(2*radius);
        return perimeter;
    }

    public double Q3_simpleInterest(int amount, int interest, int year){
        double simpleInterest = amount+amount*(interest/100)*year;
        return interest;
    }
    public double Q3_compoundInterest(int amount, int interest, int year){
        double compoundInterest = amount*(1+interest/100) ^ year;
        return compoundInterest;
    }

    ///swapping two variables
    public void Q4_swap(int number1, int number2){
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println(number1+" "+number2);
    }


    public void Q6_oddEven(int number){
        if (number % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public double Q7_temperature(double c, double f){
        c = (f -32)/1.8;
        return c;
    }

    public static float Q8_commision(int sales, int age){
        float comm;
        if (sales <= 0){
            comm = 0;
        } else if (sales >= 10000 && sales < 50000){
            if (age<60){
                comm = 0.05f * sales;
            } else {
                comm = 0.055f * sales;
            }
        } else {
            if (age <= 60){
                comm = 0.06f*sales;
            } else {
                comm = 0.065f*sales;
            }
        }
        return comm;
    }

    public int Q9_arithmetic(int number1, int number2, String operator){

        char op = operator.charAt(0);

        switch (op){
            case '+' :
//                System.out.println(number1+ number2);
                 return sum(number1, number2);
            case '-' :
                return number1-number2;
            case '*' :
                return number1*number2;
            case '%' :
                return number1%number2;
            default:
                System.out.println("Enter valid operator");
                return 0;
        }

    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

//    public int power1(int number) {
//
//        return Math.pow(5);
//
//    }

    public int Q10_factorial(int number){
        int factorial=1;
        if (number <= 0){
            System.out.println("Enter positive number");
        }
        if (number > 0){
            for (int i =1 ; i<= number; i++){
                factorial = factorial*i;
            }
        }
        return factorial;
    }

    public int Q13_fibonacciSeries(int number){
        int term1 =0;
        int term2 =1;
        System.out.print(term1+" "+term2+" ");
        int term3 =0;
        for (int i=2; i<=number; i++){
            term3 = term1+term2;
            System.out.print(term3+" ");
            term1  = term2;
            term2 = term3;
        }
        return term3;
    }

    public int Q16_gcd(int number1, int number2){
        int temp;
        int temp1 = number1;
        int temp2 = number2;
        while (temp2 != 0 ){
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        return temp1;
    }

}
