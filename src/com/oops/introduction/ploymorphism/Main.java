package com.oops.introduction.ploymorphism;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        Circle circle = new Circle();
//        Square square = new Square();
//
//        shape.area();
//        circle.area();
//        square.area();

        ExampleA a = new ExampleA();
        a.add(5, 5); // compile time polymorphism(method overloading)
        a.add(1,2,3);

        ExampleB b = new ExampleB();
        b.print(); //Run time polymorphism ((method overriding)
    }
    //Overloading main method
//    public static void main(char[] args) {
//        System.out.println("char type");
//    }
//
//    public static void main(int[] args) {
//        System.out.println("int type");
//    }
//
//    public static void main(double[] args) {
//        System.out.println("double type");
//    }
//
//    public static void main(float[] args) {
//        System.out.println("float type");
//    }
}
