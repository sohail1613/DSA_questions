//https://leetcode.com/problems/to-lower-case/

package com.company.Strings;

public class Q709_ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        //StringBuilder reduces the storage and runtime
        StringBuilder sb = new StringBuilder();
        //to store each character from s and then check it's lower or upper case
        char c;

        //iterating whole length of s
        for(int i=0; i<s.length(); i++){
            c= s.charAt(i); // storing characters to s at each index i

            if(c>='A' && c<='Z'){
                //converting to lower case
                c=Character.toLowerCase(c);
                sb.append(c);
            } else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
