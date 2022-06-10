package com.company.encapsulation;

public class Student {
    private int age;
    private String name;
    private String department;
    private float fees;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    public float getFees(){
        return fees;
    }
    public void setFees(float fees){
        this.fees=fees;
    }
}
