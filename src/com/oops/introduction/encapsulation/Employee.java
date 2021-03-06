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
    public void setEmpName(String name){
        this.empName =name;
    }
    public void setEmpAge(int age){
        this.empAge=age;
    }
    public void setEmpSalary(double salary){
        this.empSalary=salary;
    }

}
