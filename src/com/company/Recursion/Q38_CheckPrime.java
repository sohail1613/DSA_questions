package com.company.Recursion;

public class Q38_CheckPrime {
    public static void main(String[] args) {
        int number = 11;
        if (isPrime(number, 2)){
            System.out.println("Yes, Prime");
        } else {
            System.out.println("Not, Prime");
        }
    }

    static boolean isPrime(int number, int i){
        //base condition
        if (number <= 2){
            return (number == 2) ? true:false;
        }

        if (number % i == 0){
            return false;
        }
        if (i * i > number){
            return true;
        }
        return isPrime(number, i+1);
    }
}
