//https://leetcode.com/problems/shuffle-string/

package com.company.Strings;

public class Q1528_ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int indices[] = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char temp[] = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            temp[indices[i]] = s.charAt(i);
        }
        //converting array to string
        return new String(temp);
    }
}
