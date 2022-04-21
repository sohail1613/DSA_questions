package com.dsa.questions.arrays;

import java.util.ArrayList;
import java.util.List;

public class Questions {
//    //Q1_Build Array from Permutation
    public int[] buildArray(int[] arr){
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }

//    Q2_Concatenation of Array
    public int[] concatenate(int[] array1){
        int[] array= new int[2*array1.length];
        for (int i=0; i< array1.length; i++){
            array[i] = array1[i];
            array[i+ array1.length] = array1[i];
        }
        return array;
    }

    //using two different array for concatenation
    public  int[] concat(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+ arr2.length];
        int i=0;
        for (int element: arr1){
            arr3[i] = element;
            i++;
        }
        for (int element: arr2){
            arr3[i] = element;
            i++;
        }
        return arr3;
    }

//    Running Sum of 1d Array
    public int[] runningSum(int[] array){
        int[] runningSum = new int[array.length];
        runningSum[0] = array[0]; //initializing sum zero

        for (int i=1; i < array.length; i++){
            //runningSum[i-1] means adding previous value to the current value
            runningSum[i] = runningSum[i-1] + array[i];
        }
        return runningSum;
    }

//    Richest Customer Wealth
    public int maxWealth(int[][] array){
        int ans = Integer.MIN_VALUE; // assign it to min  value, or zero

        for (int[] element : array){ // for each sub-array element in the array
            int sum = 0;
            for (int i : element){
                sum = sum+i;
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }

//   1470. Shuffle the Array
    public int[] shuffleArray(int[] arr, int n){
        int[] result = new int[arr.length];
        int start = 0;
        int end = arr.length - n; //we can also use by dividing length to half of array length
        for (int i=0; i<arr.length; i++){
            if (i % 2 == 0){
                result[i] = arr[start++];
            } else {
                result[i] = arr[end++];
            }
        }
        return result;
    }

//    Question_1512.Number of Good Pairs
    public int goodPair(int[] array){
        int pair = 0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                if (array[i] == array[j] && i<j){
                    pair++;
                }
            }
        }
        return pair;
        //time complexity is: O(N)
    }

//    1365. How Many Numbers Are Smaller Than the Current Number
    public int[] smallerNumbersThanCurrent(int[] array){
        int[] ans = new int[array.length];
        int count;
        for (int i=0; i< array.length; i++){
            count = 0;
            for (int j=0; j<array.length; j++){
                if (array[i] > array[j]){
                    count++; // counting greater numbers than current number
                }
            }
            ans[i] = count; // adding total how many smaller numbers present in array then current numbers.
        }
        return ans;
    }

//    https://leetcode.com/problems/create-target-array-in-the-given-order/
//    Question_1389. Create Target Array in the Given Order
    public int[] targetArray(int[] array, int[] index){
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[array.length];
        for (int i=0; i<array.length; i++){
            list.add(index[i], array[i]);
        }
        for (int i=0; i<array.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

//    https://leetcode.com/problems/check-if-the-sentence-is-pangram/
    public boolean pangram(String sentence){
        for (char c='a'; c<='z'; c++){
            if (!sentence.contains(""+c)){
                return false;
            }
        }
        return true;
    }


//    https://leetcode.com/problems/count-items-matching-a-rule/
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        for (List<String> list : items){ // every item in sub list
            if (ruleKey.equals("type") && ruleValue.equals(list.get(0))){
                count++;
            } else if (ruleKey.equals("color") && ruleValue.equals(list.get(1))){
                count++;
            } else if (ruleKey.equals("name") && ruleValue.equals(list.get(2))) {
                count++;
            }
        }
        return count;
    }

//    https://leetcode.com/problems/find-the-highest-altitude/
    public int highestAltitude(int[] gain){
        int max = Integer.MIN_VALUE;
        int[] array = new int[gain.length+1];
        for (int i=0; i<gain.length; i++){
            array[0] = 0; //At starting point it should be zero
            //at n+1 point is  = element at index [n] of array and gain.
            array[i+1] = array[i] + gain[i]; //storing values in array
        }
//        for (int i=0; i<array.length; i++){
//            //if element in array[i] is greater than max, then assign it to the max
//            if (max < array[i]){
//                max = array[i];
//            }
//        }
        //comparing every element in the array with max, adn if found small than max, then assigning it to max
        for (int element: array){
            if (max < element){
                max = element;
            }
        }
        return max;
    }
}
