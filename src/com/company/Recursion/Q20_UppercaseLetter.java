//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
package com.company.Recursion;

public class Q20_UppercaseLetter {
    public static void main(String[] args) {
        String str = "Adri";
        char  res = upperCase(str, 0);
        if (res == 0){
            System.out.println("No upper class found.");
        } else{
            System.out.println(res);
        }
    }

    static char upperCase(String str, int i){
        if (str.charAt(i) == '\0'){
            return 0;
        }

        if (Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        } try{
            return upperCase(str, i+1);
        } catch (Exception e){
            System.out.println("Exception occurs");
        }
        return 0;
    }
}
