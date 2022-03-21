//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

package com.company.Strings;

public class Q1662_StringEquivalent {
    public static void main(String[] args) {
        String str1[] = {"ab", "c"};
        String str2[] = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(str1, str2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //using StringBuilder
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(String s: word1) str1.append(s);
        for(String s: word2) str2.append(s);

//         comparing both strings
        return str1.toString().equals(str2.toString());
    }
}
