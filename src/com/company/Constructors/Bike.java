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
        s.greeting();
        s.changeName("Ansar");

        Student random = new Student(s);
        System.out.println(random.name);
    }

    //we need to add the values of the above properties object by object.
    //that keyword is this.
    Student(){
        this.id=13;
        this.name="Sohail";
        this.salary = 20000.00f;
    }

    //creating another constructor that actually takes values from another objects
    Student(Student other){
        this.id = other.id;
        this.name = other.name;
        this.salary = other.salary;
    }


    //Student belinay = new Student(11, "Belinay", 46773289f);
    //here, this will replaced with belinay
    Student (int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void greeting(){
        System.out.println("Hello my name is : "+this.name);
        //this keyword used because we are trying to access class item via its object
    }

    void changeName(String NewName){
        name = NewName;
    }
}

//constructor is a special function, that runs when you create an object and it allocate some variables.



