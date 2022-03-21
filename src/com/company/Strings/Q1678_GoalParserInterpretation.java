//https://leetcode.com/problems/goal-parser-interpretation/

package com.company.Strings;

public class Q1678_GoalParserInterpretation {
    public static void main(String[] args){
        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder(command.length());
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G') sb.append('G');
            if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')') {
                    sb.append('o');
                    i++;
                } else{
                    sb.append("al");
                    i=i+2;
                }
            }
        }
//        converting to string type.
        return sb.toString();
    }
}
