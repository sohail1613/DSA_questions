//The idea is to sort array first. After sorting, one by one fix characters and recursively generates all
// subsets starting from them. After every recursive call, we remove last character so that next permutation
// can be generated.

package com.company.Recursion;

import java.util.Arrays;

public class Q47_Lexicographical {
    public static void main(String[] args) {
        String word = "cab";
        powerSet(word);
    }

    static void powerSet(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        permutationRet(new String(arr), str.length(), -1, "");
    }
    
    private static void permutationRet(String str, int n, int index, String current) {
        //base condition
        if (index == n){
            return;
        }

        System.out.println(current);
        for (int i=index+1; i<n; i++){
            current += str.charAt(i);
            permutationRet(str, n, i, current);

            //backtracking
            current = current.substring(0, current.length()-1);
        }
        return;
    }
}
