package com.company.Recursion;

import java.util.ArrayList;

public class Q26_SubSequence {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(subSeqList("", "abc"));
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

    static ArrayList<String> subSeqList(String p, String up){
        //base condition
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqList(p+ch, up.substring(1));
        ArrayList<String> right = subSeqList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
