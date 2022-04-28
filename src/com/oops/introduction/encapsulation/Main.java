package com.oops.introduction.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpName("Sohail");
        emp.setEmpAge(26);
        emp.setEmpSalary(828437.98);

        System.out.println("Employee name :"+emp.getEmpName());
        System.out.println("Employee age :"+emp.getEmpAge());
        System.out.println("Employee salary :"+emp.getEmpSalary());
    }
}
