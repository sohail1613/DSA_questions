package com.dsa.questions.arrays;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Questions que = new Questions();
//
//        int[] array = {0,2,1,5,3,4};
//        int[] ans = que.buildArray(array);
//        System.out.println(Arrays.toString(ans));

//        int[] array1 = {1, 2, 3, 4, 5};
////        int[] answer = que.concatenate(array1);
////        System.out.println(Arrays.toString(answer));
//        int[] arr = {6, 7, 8, 9};
//        int[] answer = que.concat(array1, arr);
//        System.out.println(Arrays.toString(answer));

//        Question Running Sum of 1d Array
//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(que.runningSum(array)));

//        Question_Richest Customer Wealth
//        int[][] account = {{1,5},{7,3},{3,5},{5, 8}};
//        System.out.println(que.maxWealth(account));

        //shuffle array
//        int[] array = {2,5,1,3,4,7};
//        int n = 3;
//        System.out.println(Arrays.toString(que.shuffleArray(array, n)));

//        1512. Number of Good Pairs
//        int[] array = {1, 2, 3, 1, 1, 3};
//        System.out.println(que.goodPair(array));

//        1365. How Many Numbers Are Smaller Than the Current Number
//        https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
//        int[] array =  {8,1,2,2,3};
//        System.out.println(Arrays.toString(que.smallerNumbersThanCurrent(array)));

//        int[] nums = {0,1,2,3,4};
//        int[] index = {0,1,2,2,1};
//        System.out.println(Arrays.toString(que.targetArray(nums, index)));

//        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        System.out.println(que.pangram(sentence));

//        List<List<String>> items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
//        String ruleKey = "color";
//        String ruleValue = "silver";
//        int answer = que.countMatches(items, ruleKey, ruleValue);
//        System.out.println(answer);

//        Highest point
        int[] gain = {-5,1,5,0,-7};
       // int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(que.highestAltitude(gain));
    }
}
