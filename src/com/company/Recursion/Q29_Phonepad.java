package com.company.Recursion;

public class Q29_Phonepad {
    public static void main(String[] args) {
        pad("", "12");
    }

    static void pad(String p, String up){
        //base condition
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int  digit = up.charAt(0) - '0'; //this will convert '2' into 2
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            pad(p+ch, up.substring(1));
        }
    }
}
