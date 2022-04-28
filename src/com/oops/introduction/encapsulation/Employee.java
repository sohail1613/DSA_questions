package com.oops.introduction.encapsulation;

public class Employee {
    private String empName;
    private int empAge;
    private double empSalary;

    //getter methods
    public String getEmpName(){
        return empName;
    }

    public  int getEmpAge(){
        return empAge;
    }

    public double getEmpSalary(){
        return empSalary;
    }

    //setter methods
    public String setEmpName(String name){
         return empName =name;
    }
    public int setEmpAge(int age){
        return empAge=age;
    }
    public double setEmpSalary(double salary){
        return empSalary=salary;
    }

}
