package com.company.Recursion;

public class Q26_SubSequence {
    public static void main(String[] args) {
        subSeq("", "abc");
    }

    static void subSeq(String p, String up){
        //base condition
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }
}
