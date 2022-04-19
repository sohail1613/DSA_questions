package com.oops.introduction.staticExample;
//outside classes cannot be static
public class InnerClasses {
    class Test{
        String name;
        public Test(String name){
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Test a = new Test("Sohail");
    }
}

//it will throw error cause its not dependent on another.
//static class A{
//
//}
