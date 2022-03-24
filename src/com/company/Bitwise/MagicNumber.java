package com.company.Bitwise;

public class MagicNumber {
    public static void main(String[] args) {
        int n=6;
        int ans =0;
        int base=5;

        while(n>0){
            int last = n & 1; //using and operator
            n = n>>1; //using right shift operator and shifting right hand side
            ans += last * base;
            base = base*5;
        }
        System.out.println(ans);
    }
}
