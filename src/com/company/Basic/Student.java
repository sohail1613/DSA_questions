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



//Usage 2: to invoke current class method
//1- we may invoke the method of current class by using this keyword.
//2- If you don't use this keyword, compiler will automatically add this keyword while invoking the method
class A{
    void m(){
        System.out.println("Hello m");
    }
    void n(){
        System.out.println("Hello n");
        this.m();
    }
}
class Test2{
    public static void main(String[] args) {
        A a= new A();
        a.n();
    }
}


//usage 3 : to invoke current class constructor
class B{
    B(){
        System.out.println("Hello b");
    }
    B(int x){
        this();
        System.out.println(x);
    }
}
class Test3{
    public static void main(String[] args) {
        B b = new B(10);
    }
}

//this keyword can be used to return current class instance
class Delhi {
    void m(){
        System.out.println(this);//print same reference ID
    }

    public static void main(String[] args) {
        Delhi obj = new Delhi();
        System.out.println(obj);//print same reference ID
        obj.m();
    }
}