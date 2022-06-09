package com.company.interferance;

public interface Colourful {
    void color1();
        interface AnotherColour{
            void color2();
        }
}
interface ThirdColor extends Colourful, Colourful.AnotherColour{ //extends nested interfaces.
    strictfp default void color1(){
        System.out.println("Blue");
    }
    strictfp default void color2(){
        System.out.println("Navy Blue");
    }
}
