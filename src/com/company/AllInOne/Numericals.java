package com.company.AllInOne;

import java.util.Scanner;

public class Numericals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1 :");
        int number1 = sc.nextInt();;
        System.out.print("Enter number2 :");
        int number2 = sc.nextInt();
        System.out.print("Enter number3 :");
        int number3 = sc.nextInt();

        //calling functions
        System.out.println("Sum of two numbers is :"+addition(number1,number2));

        System.out.println("Subtraction of two numbers is: "+subtraction(number1,number2));

        leapYear(number1);

        oddEven(number1);

        System.out.println("Largest number is :"+largestNumber(number1,number2,number3));

        fibonacciSeries(number1);

        System.out.println("Sum of the n numbers is: "+numberSum(number1));

        palindromeNumber(number1);

        System.out.println("An integer product sum subtracted value is :"+subtractProductSum(number1));

        swap(number1, number2);

        System.out.println("Power of "+number1+" with exponent "+number2+" "+power(number1, number2));


        //check prime number
        if (isPrime(number1)){
            System.out.println(number1+" is a prime number.");
        } else {
            System.out.println(number1+" is not prime number.");
        }

        System.out.println("LCM of "+number1+" and "+number2+" is :"+lcm(number1, number2));

        lcmHcf(number1, number2);

        System.out.println("LCM is :"+findLcm(number1, number2));
        System.out.println("HCF is :"+findHcf(number1, number2));
    }

    //Addition
    public static int addition(int number1, int number2) {
        int sum = number1+number2;
        return sum;
    }

    //subtraction
    public static int subtraction(int number1, int number2){
        return number1-number2;
    }


    //Leap year
    public static int leapYear(int number){
        if (number%400 == 0 || number%4 ==0 && number%100 !=0){
            System.out.println("It's leap year :"+number);
        } else {
            System.out.println("It's not leap year :"+number);
        }
        return number;
    }

    //Check odd and even numbers
    public static void oddEven(int number){
        if (number%2==0){
            System.out.println("Given number is even :"+number);
        } else {
            System.out.println("Given number is odd :"+number);
        }
    }

    //check and print largest number
    public static int largestNumber(int number1, int number2, int number3){
        int temp, largest;
        if (number1>number2){
             temp=number1;
        } else {
            temp =number2;
        }
        if (temp>number3){
            largest=temp;
        } else {
            largest=number3;
        }
        return largest;
    }

    //Print fibonacci series
    public static void fibonacciSeries(int number){
        int temp1=0;
        int temp2=1;
        int temp3;
        System.out.print("Fibonacci series of "+number+" is :");
        System.out.print(temp1+" "+temp2);

        for (int i=2; i<=number; i++){
            temp3=temp1+temp2;
            System.out.print(" "+temp3);
            temp1=temp2;
            temp2=temp3;
        }
        System.out.println();
    }

    //print sum of n numbers
    public static int numberSum(int number){
        int sum=0;
        for (int i=1; i<=number; i++){
            sum=sum+i;
        }
        return sum;
    }

    //palindrome number
    public static void palindromeNumber(int original){
        int duplicate=original;
        int remainder, reverse=0;

        while (original!=0){
            remainder=original%10;
            reverse=reverse*10+remainder;
            original=original/10;
        }
        if (reverse==duplicate){
            System.out.println("Given number is palindrome.");
        } else {
            System.out.println("Given number is not palindrome.");
        }
    }

    //subtract the product sum of an integer
    public static int subtractProductSum(int number){
        int sum=0, product=1, digit;
        while (number!=0){
            digit=number%10;
            sum=sum+digit;
            product=product*digit;
            number=number/10;
        }
        return product-sum;
    }

    //swapping 2 numbers without using third variable.
    public static void swap(int first, int second){
        first=first+second;
        second=first-second;
        first=first-second;
        System.out.println("First number is :"+first);
        System.out.println("Second number is :"+second);
    }

    //power program
    public static int power(int base, int exponent){
        int power=1;
        for (int i=1; i<=exponent; i++){
            power=power*base;
        }
        return power;
    }

    //check prime number
    public static boolean isPrime(int number){
        int i;
        for ( i=2; i<=number/2; i++){
            if (number%i==0){
                break;
            }
        }
        return i>number/2;
    }

    //find lcm
    public static int lcm(int number1, int number2){
        int large, small;
        if (number1 > number2){
            large = number1;
            small = number2;
        } else {
            large = number2;
            small = number1;
        }

        for (int i=large; ; i=i+large){
            if (i % small == 0){
                return i;
            }
        }
    }

    //find lcm and hcf
    public static void lcmHcf(int number1, int number2){
        int temp1=number1;
        int temp2=number2;
        int lcm, hcf, temp;

        while (temp2!=0){
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 =temp;
        }
        hcf = temp1;
        lcm = (number1*number2)/hcf;

        System.out.println("LCM is :"+lcm);
        System.out.println("HCF is :"+hcf);
    }

    //https://github.com/zaidhafeez/PracticeDSA/blob/main/src/practice/assignment/assignment1/Q4_HCF_LCM.java
    //find lcm and hcf (another logic)
    private static int findLcm(int number1, int number2){
        int large=(number1>number2) ? number1 : number2;

        while (true){
            if (large % number1 ==0 && large%number2==0){
                return large;
            } else {
                large++;
            }
        }
    }
    private static int findHcf(int number1, int number2){
        while (number1 != number2){
            if (number1>number2){
                number1=number1-number2;
            } else {
                number2 = number2-number1;
            }
        }
        return number1;
    }
}
