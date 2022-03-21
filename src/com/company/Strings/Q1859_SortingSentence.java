//https://leetcode.com/problems/sorting-the-sentence/

package com.company.Strings;

public class Q1859_SortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println();
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] str = s.split(" ");          // Since the String contains only whitespaces, it's safe to split the String at them
        String[] res = new String[str.length];      // This String array will hold the rearranged words
        StringBuilder sb = new StringBuilder();     // Instead of using '+' operator to concat repeatedly, I have created a StringBuilder object which is more efficient
        int i = 0;
        for (String element : str) {
            i = (int) (element.charAt(element.length() - 1) - '0');  // This  will extract the digit present at the end of each String and store it in i (i = index of the word in res[])
            res[i - 1] = element.substring(0, element.length() - 1); // This gives the substring of each String except for the digit in the end and stores the word at an appropriate index (i - 1) in res[]
        }
        //append the words from res[] to StringBuilder.
        for (i = 0; i < res.length - 1; i++)
            sb.append(res[i]).append(" ");
            sb.append(res[i]);
        return sb.toString();
    }
}
