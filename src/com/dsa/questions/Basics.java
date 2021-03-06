package com.dsa.questions;


import java.util.Scanner;

public class Basics {
    Scanner sc = new Scanner(System.in);

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

    // swap two variables only using two variables
    public void Q5_swapping(int number1, int number2){
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
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

//    solve factorial using while loop
    public int Q11_factorial(int number){
        int factorial=1;
        while(number > 0){
            factorial = factorial*number;
            number--;
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
    // solve using while loop
    public int Q13_fibonacci(int number){
        int term1 = 0;
        int term2 = 1;
        int i=1;
        int temp=0;
        while(i <= number){
            System.out.print(term1+" ");
            temp = term1+term2;
            term1 = term2;
            term2 = temp;
            i++;
        }
        return temp;
    }



    // improve this you are using extra variables //
    // alternative method to calculate gcd //
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
//    improved
    public int Q16_improved(int number1, int number2){
        int temp;
        while(number2 != 0){
            temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }


    public int Q17_digitSum(int digit){
        int sum = 0;
        while(digit != 0){
            int remainder = digit % 10;
            sum = sum + remainder;
            digit = digit/10;
        }
        return sum;
    }

    public int Q18_reverse(int number){
        int rev = 0;
        while(number != 0){
            int remainder = number % 10;
            rev = (rev * 10) + remainder;
            number = number / 10;
        }
        return rev;
    }

    public int Q19_palindrome(int number){
        int temp = number;
        if (temp == Q18_reverse(number)){
            return number;
        } else {
            return 0;
        }
    }

    public int Q20_smallestNumber(int number1, int number2, int number3){
        int temp, smallest;
        if (number1 < number2){
            temp = number1;
        } else{
            temp = number2;
        }

        if (temp < number3){
            smallest = temp;
        } else {
            smallest= number3;
        }
        return smallest;
    }

    public int Q20_largestNumber(int number1, int number2, int number3){
        int temp,largest;
        if (number1> number2){
            temp = number1;
        } else {
            temp = number2;
        }
        if (temp > number3){
            largest = temp;
        } else {
            largest = number3;
        }
        return largest;
    }

    public boolean Q21_isPrime(int number){
        if (number == 0 || number == 1){
            return false;
        }
        if (number == 2){
            return true;
        }

        for (int i=2; i*i<= number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    //Arrays
    public void Q1_Arrays(int[] arr){
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //Traversing Array
    public int Q2_traversingArray(int[] array){
        int sum = 0;
        for (int i=0; i<= array.length-1; i++){
            sum += array[i];
        }
        return sum;
    }

//    Array sorting
    public int[] Q3_bubbleSorting(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j=0; j< array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

//    Array matrix
    public void Q4_printMatrix(int[][] arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

//    String length
    public int Q5_stringLength(String word){
        int length=0;
        char[] size = word.toCharArray();
        for (char c: size){
            length++;
        }
        return length;
    }

//    2D-Matrix sum
    public void Q6_matrixSum(int[][] matrix){
       int[][] mat=new int[matrix.length-1][matrix[0].length-1];
       //first row and column
       for (int i=0; i<matrix[0].length-1; i++){
           mat[0][i] = mat[0][i-1] + matrix[0][i];
       }
       for (int i=1; i< matrix.length-1; i++){
           mat[i][0] = mat[i-1][0] + matrix[i][0];
       }
       //updating values in cells
        for (int i=1; i<matrix.length-1; i++){
            for (int j=1; j<matrix[0].length-1; j++){
                mat[i][j] = mat[i-1][j] + mat[i][j-1] - mat[i-1][j-1]+matrix[i][j];
            }
        }
        for (int i=0; i<matrix.length-1; i++){
            for (int j=0; j<matrix[0].length-1; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

//  Q23  Subtract the Product and Sum of Digits of an Integer
    public int Q23_subtractProductAndSum(int number){
        int sum=0;
        int product = 1;
        while(number != 0){
            sum += number % 10;
            product *= number % 10;
            number = number / 10;
        }
        return (product - sum);
    }

//    Q24_Input a number and print all the factors of that number (use loops)
    public void Q24_factors(int number){
        for (int i=1; i< number; i++){ //we can't start loop from zero, it wll give error
            if (number % i == 0){
                System.out.print(i+" ");
            }
        }
    }

//    Question: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public int Q25_numberSum() {
        int sum = 0;
        int number;
        while (true) {
            System.out.print("Enter number :");
            number = sc.nextInt();

            //terminating condition, when user enter zero.
            if (number == 0){
                break;
            } else {
                sum += number;
            }
        }
        return sum;
    }

//    Question-Take integer inputs till the user enters 0 and print the largest number from all.
    public int Q26_printLargestNumber(){
        int largest = 0;
        int number;
        while(true){
            System.out.print("Enter number : ");
            number = sc.nextInt();

            //terminating condition, when user enters zero
            if (number == 0){
                break;
            }
            if(number > largest){
                largest = number;
            }
        }
        return largest;
    }

//    Question26- Addition Of Two Numbers
    public int numberSum(int number1, int number2){
        return number1 + number2;
    }

//    Question_27- Calculate Average Of N Numbers
    public int average(int number){
        int sum = 0;
        float n ;
        int count = 1;
        while(count <= number ){
            n = sc.nextInt();
            sum += n;
            ++count;
        }
        return sum/number;
    }

//    Question_28-Sum Of N Numbers
    public int sumOfNumbers(int number){
        int sum =0;
        int count =1;
        int n;
        while(count <= number){
            n = sc.nextInt();
            sum += n;
            ++count;
        }
        return sum;
    }

//    Question_29-Palindrome Number In Java
    public boolean palindromeNumber(int number){
        int remainder;
        int sum=0;
        int temp = number;
        while(number != 0){
            remainder = number % 10;
            sum = (sum*10) + remainder;
            number = number/10;
        }
        if (sum == temp){
            return true;
        } else{
            return false;
        }
    }

//    Question 30-Armstrong Number In Java
    public boolean armstrongNumber(int number){
        int sum=0;
        int remainder;
        int temp = number;
        while(number != 0){
            remainder = number % 10;
            sum = sum+(remainder*remainder*remainder);
            number /= 10;
        }
        if (sum == temp){
            return true;
        } else{
            return false;
        }
    }

//    Question 31-Reverse A String In Java
    public String reverseString(String word){
        char c;
        String alphabet = "";
        for (int i = 0; i<word.length(); i++) {
            c = word.charAt(i); //extracting characters
            alphabet = c + alphabet;  //adding each character
        }
        return alphabet; //returning reversed string
    }

//    Question 32-Power In Java
    public int findPower(int base, int power){
        int ans = 1;
        while(power != 0){
            ans = ans*base;
            power--;
        }
        return ans;
    }

//
}
