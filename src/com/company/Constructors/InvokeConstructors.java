package com.company.Constructors;

public class InvokeConstructors {
     InvokeConstructors(int x, int y){ //these constructors will invoke from main method
         this(5);//it will invoke one parameterized constructor
         System.out.println(x+y);
     }
     InvokeConstructors(int x){
         this();//it will invoke default constructor
         System.out.println(x);
     }
     InvokeConstructors(){
         System.out.println("Default constructor");
     }
}
