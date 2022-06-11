package com.company.interfaceExample;

public interface Colourful {
    void color1();
        interface AnotherColour{
            void color2();
        }
}
interface ThirdColor extends Colourful, Colourful.AnotherColour{ //extends nested interfaces.
    default void color1(){
        System.out.println("Blue");
    }
    default void color2(){
        System.out.println("Navy Blue");
    }
}
