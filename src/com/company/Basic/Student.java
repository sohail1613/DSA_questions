//usage of this keyword = total 6 usage

package com.company.Basic;

class Student {
    int rollNo;
    String name;
    float fees;

    Student(int rollNo, String name, float fees){ // parameterized constructor
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
    }

    void display(){
        System.out.println(rollNo+" "+name+" "+fees);
    }
}

class TestThis{
    public static void main(String[] args) {
        Student s = new Student(1, "Nedal", 2500.00f);
        Student a = new Student(2, "Rahman", 3000.35f);

        s.display();
        a.display();
    }
}
