package com.company.Recursion;

public class Q28_Permutations {
    public static void main(String[] args) {
        permutations("", "abc");
    }

    static void permutations(String p, String up){
        //base condition
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = up.substring(i, p.length());
            permutations(first+ch+second, up.substring(1));
        }
    }
}
