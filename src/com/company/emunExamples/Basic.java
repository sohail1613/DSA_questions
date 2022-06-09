package com.company.emunExamples;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        //these are enum constants
        //and by default they are public, static and final
        //since its final we can create child enums
        //their type is Week
    }

    //How to use enums
    public static void main(String[] args) {
        Week week;
//        week = Week.Monday;
//        System.out.println(week);
//        System.out.println(week.ordinal());

        //we can also iterate
        for (Week day : Week.values()){
            System.out.println(day);
        }

    }
}
