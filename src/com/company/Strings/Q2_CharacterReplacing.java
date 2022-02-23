//Input a string from the user. Create a new string called ‘result’ in which you will
//replace the letter ‘e’ in the original string with letter ‘i’.
//Example :
//original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”

package com.company.Strings;

import java.util.Scanner;

public class Q2_CharacterReplacing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words: ");
        String original = sc.nextLine();
        String result = "";

        for (int i=0; i<original.length(); i++){
            if (original.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += original.charAt(i);
            }
        }
        System.out.println("Original string is: "+original);
        System.out.println("After replacement string is: "+result);
    }
}
