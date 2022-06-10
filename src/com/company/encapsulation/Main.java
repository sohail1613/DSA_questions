package com.company.encapsulation;

public class Main{
    public static void main(String[] args) {
        //instantiating Student object
        Student student = new Student();
        student.setAge(22); //set age using setter and others
        student.setName("Mustafa");
        student.setDepartment("CSE");
        student.setFees(9723.89f);
        //now getting values by using getter
        System.out.println(student.getAge()+" : "+student.getName()+" : "+student.getDepartment()+" : "+student.getFees());
    }
}
