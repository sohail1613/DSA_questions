//Check if a given string is palindrome using recursion.
package com.company.Strings;

import java.util.Scanner;

public class Q6_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Is "+word+" palindrome? "+isWordPalindrome(word));
    }

    private static boolean isWordPalindrome(String word) {
        String reversedWord = getReversedWord(word);
        if (word.equals(reversedWord)){
            return true;
        }
        return false;
    }

    private static String getReversedWord(String word) {
        if (word == null || word .isEmpty()){
            return word;
        }
        return word.charAt(word.length()-1) + getReversedWord(word.substring(0, word.length()-1));
    }
}
