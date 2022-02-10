//Write an array program to print subject (Math, physics and chemistry) marks

package com.company.Arrays;

public class Q1_Marks {
    public static void main(String[] args) {
        //array syntax
        // type[] arrayName = new type[size];
        int[] marks = new int[3];

        marks[0] = 79; //Math
        marks[1] = 80; //Physics
        marks[2] = 81; //Chemistry

        //we have to pass index. Otherwise, it will print garbage value
        System.out.println("Marks in maths :"+marks[0]);
        System.out.println("Marks in physics :"+marks[1]);
        System.out.println("Marks in chemistry :"+marks[2]);
        
        //we can solve by using loop
        System.out.println("Solving with for loop");

        for (int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
