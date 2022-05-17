package com.company.Constructors;
//CONSTRUCTOR IS USED TO INITIALIZE OBJECT

//default constructor
//syntax:  <class_name>(){}
class Bike {
    Bike(){ // constructor created
        System.out.println("Running");
    }

    public static void main(String[] args){
        Bike b = new Bike(); //calling default constructor
    }
}

//Rule: If there is no constructor in a class, compiler automatically creates a default constructor.


//The default constructor is used to provide the default values to the object like 0, null, etc.
//depending on the type.
class Student{
    int id;
    String name;
    float salary;
    
    //method to display values of id, name , salary
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }

    public static void main(String[] args) {
        //creating object
        Student s = new Student();
        //displaying values of objects
        s.display();
    }
}


