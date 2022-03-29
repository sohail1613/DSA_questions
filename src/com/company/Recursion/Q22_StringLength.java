//Find Length of string using Recursion.

package com.company.Recursion;

public class Q22_StringLength {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(length(str));
    }

    static int length(String str){
        if (str.equals("")) //if we reach at the end of string
            return 0;
        else
            return length(str.substring(1)) + 1;
    }
}
