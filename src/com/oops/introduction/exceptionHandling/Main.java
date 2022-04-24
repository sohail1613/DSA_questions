package com.oops.introduction.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
       // int c = a / b; // exception occurs to solve it use try and catch
        //Exception handling
        try{
            //int c = a / b;
            divide(a, b);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        //return a / b;
        if (b == 0){
            throw new ArithmeticException("Do not divide ny zero");
        }
        return a / b;
    }
}
