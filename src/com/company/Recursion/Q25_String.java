//Remove 'a' from given string using recursion

package com.company.Recursion;

public class Q25_String {
    public static void main(String[] args) {
        skip("", "adari");
        System.out.println(skipReturn("ankara"));
        System.out.println(skipApple("Ankaraappleadri"));
        System.out.println(skipAppNotApple("Ankaraappleadri"));

    }

    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            skip(p, up.substring(1));
        } else {
            skip(p+ch, up.substring(1));
        }
    }

    static String skipReturn(String up){
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            return skipReturn(up.substring(1));
        } else {
            return ch + skipReturn(up.substring(1));
        }
    }

    //how to skip String
    static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
