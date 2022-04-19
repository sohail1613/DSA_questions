package com.oops.introduction.staticExample;

public class Main {
    public static void main(String[] args) {
        Human sohail = new Human(26, "Mohammad Sohail", 10000, false);
        Human zaid = new Human(26, "Zaid Hafeez", 20000, false);

//        System.out.println(sohail.population);
//        System.out.println(zaid.population);
        // convention is
        // and static variables are not dependent on objects
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
