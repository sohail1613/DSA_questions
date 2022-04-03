package com.company.Recursion;

public class Q46_RemoveDuplicates {
    public static void main(String[] args) {
        String duplicates = "leetcode";
        System.out.println(consecutiveDuplicates("aaabbccccca"));
    }

    static String consecutiveDuplicates(String word){
        //base condition
        //when String is empty then, return String
        if (word.length() <= 1){
            return word;
        }

        if (word.charAt(0) == word.charAt(1)){
            return consecutiveDuplicates(word.substring(1));
        } else{
            return word.charAt(0) + consecutiveDuplicates(word.substring(1));
        }
    }
}
