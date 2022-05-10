package com.dsa.questions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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

    //832. Flipping an Image
    //https://leetcode.com/problems/flipping-an-image/
    public int[][] flipAndInvertImage(int[][] image){
        for (int i = 0; i < image.length; i++){
            int row = 0;
            int col = image[0].length-1;

            while(row <= col){
                int temp = image[i][row];
                image[i][row] = (image[i][col]^1);
                image[i][col] = (temp ^ 1);
                row++;
                col--;
            }
        }
        return image;
    }

    //Question : Cells with Odd Values in a Matrix
    public int oddCell(int m, int n, int[][] indices){
        int[] row = new int[m];
        int[] col = new int[n];

        for (int i=0; i<indices.length; i++){
            row[indices[i][0]] += 1;
            col[indices[i][1]] += 1;
        }

        int result = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (row[i]+col[j] % 2 != 0){
                    result ++;
                }
            }
        }
        return result;
    }

//  1572. Matrix Diagonal Sum
    public int diagonalSum(int[][] matrix){
        int sum =0;
        for (int i=0; i< matrix.length; i++){
            sum += matrix[i][i]; //element at 0,0 || 1,1 || 2,2
            if (matrix.length-1-i != i){ //element at (last -1 -i) should not be equal to i
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    //1295. Find Numbers with Even Number of Digits
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public int findNumbers(int[] array){
        int count = 0;
        for (int i=0; i<array.length; i++){
            //numbers between 0 to 10 are one digit hence odd digit
            //number between 10 to 99 are twi digits, hence Even digits
            //like these we will consider and count numbers
            if ((array[i]>9 && array[i]<100) || (array[i]>999 && array[i]<10000) || array[i] == 100000){
                count++;
            }
        }
        return count;
    }

    //Alternate solution of above problem
    public int countNumbers(int[] array){
        int count = 0;
        for (int i=0; i<array.length; i++){
            int digit = 0;
            int element = array[i];
            while(element != 0){
                element /= 10;
                digit++;
            }
            if (digit % 2 == 0){
                count++;
            }
        }
        return count;
    }
    
    //above solution with foreach loop
    public int countEven(int[] array){
        int count =0;
        int digit=0;
        for (int element: array) {
            while(element != 0){
                element /= 10;
                digit++;
            }
            if (digit % 2 == 0){
                count++;
            }
        }
        return count;
    }

    //867. Transpose Matrix
    //https://leetcode.com/problems/transpose-matrix/
    public int[][] matrixTranspose(int[][] matrix){
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    //https://leetcode.com/problems/add-to-array-form-of-integer/
    //989. Add to Array-Form of Integer
    public List<Integer> addToArrayForm(int[] num, int k){
        final LinkedList<Integer> result = new  LinkedList<>();
        int len = num.length-1;
        while(len>=0 || k!=0){
            if (len>=0){
                k += num[len--];
            }
            result.addFirst(k%10);
            k /= 10;
        }
        return result;
    }

    // Maximum Population Year
    public int maximumPopulation(int[][] logs){
        int[] year = new int[2051];
        for (int[] log : logs){
            year[log[0]] += 1;
            year[log[1]] -= 1;
        }
//        Constraints:
//          1 <= logs.length <= 100
//          1950 <= birthi < deathi <= 2050
        int maxNum = year[1950], maxYear = 1950;
        for (int i=1950; i<year.length; i++){
            year[i] += year[i-1];
            if (year[i] > maxNum){
                maxNum = year[i];
                maxYear = i;
            }
        }
        return maxYear;
    }

    //1886. Determine Whether Matrix Can Be Obtained By Rotation
    //https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
    public boolean findRotation(int[][] matrix, int[][] target){
        int[][] reverse = new int[matrix.length][matrix.length];

        //rotating 90 clockwise
        //we can also rotate further more using same technique(like 180, 270, and 360 degree)
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix.length; j++){
                reverse[i][j] = matrix[matrix.length-j-1][i];
            }
        }

        //here we will compare both matrices and matched then return true, otherwise false
        if (Arrays.deepEquals(target, reverse)){
            return true;
        }
        return false;
    }

    //improved above solution
    public boolean findRotationMatrix(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; ++i) {
            if (Arrays.deepEquals(mat, target))
                return true;
            rotate(mat);
        }
        return false;
    }

    private void rotate(int[][] M) {
        for (int i = 0, j = M.length - 1; i < j; ++i, --j) {
            int[] temp = M[i];
            M[i] = M[j];
            M[j] = temp;
        }
        for (int i = 0; i < M.length; ++i)
            for (int j = i + 1; j < M.length; ++j) {
                final int temp = M[i][j];
                M[i][j] = M[j][i];
                M[j][i] = temp;
            }
    }

    //1. Two Sum
    //https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] array, int target){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                //if i == j then skip cause we are looking for tow different indexed element
                if (i == j){
                    continue;
                }
                //when target found return its index number
                if (array[i] + array[j] == target){
                    int[] arr = {i, j};
                    return arr;
                }
            }
        }
        return new int[] {};
    }

    //reverse integer type String
    //Example input = "1 2 3";
    //output = 3 2 1
    public int reverseString(String str){
        int reverse = 0;
        char c;
        for (int i= str.length()-1; i>0; --i){
            c = str.charAt(i);
            reverse = reverse + c;
        }
        return reverse;
    }

    //1304. Find N Unique Integers Sum up to Zero
    //https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
    public int[] sumZero(int n){
        int[] result = new int[n];
        for (int i =0; i< n-1; i += 2){
            result[i] = i + 1;
            result[i+1] =  -(i+1);
        }
        return result;
    }

    //above solution
    public void uniqueIntSum(int number){
        int[] result = new int[number];
        for (int i=1; i<= number/2; i++){
            System.out.print(i+", "+(-i)+", ");
        }
        if (number%2 == 1){
            System.out.print(0);
        }
    }

    //convert time into words
    public void inWords(int hour, int minutes){
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                          "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                          "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two",
                          "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
                          "twenty eight", "twenty nine"};
        if (minutes == 0){
            System.out.println(nums[hour]+" o' clock");
        } else if (minutes == 1) {
            System.out.println("one minute past "+nums[hour]);
        } else if (minutes == 59) {
            System.out.println("one minutes to "+nums[(hour%12)+1]);
        } else if (minutes == 15) {
            System.out.println("quarter past "+nums[hour]);
        } else if (minutes == 30) {
            System.out.println("half past "+nums[hour]);
        } else if (minutes == 45) {
            System.out.println("quarter to "+nums[(hour%12)+1]);
        } else if (minutes <= 30) {
            System.out.println(nums[minutes]+" minutes past "+nums[hour]);
        } else if (minutes > 30) {
            System.out.println(nums[60-minutes]+" minutes to "+nums[(hour%12)+1]);
        }
    }

    //1380. Lucky Numbers in a Matrix
    //https://leetcode.com/problems/lucky-numbers-in-a-matrix/
    public List<Integer> luckyNumber(int[][] matrix){
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<matrix.length; i++){
            int minId = 0;
            int min = 999999;
            for (int j=0; j< matrix.length; j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                    minId = j;
                }
            }
            boolean isTrue = true;
            for (int j =0; j< matrix.length; j++){
                if (matrix[i][minId] < matrix[j][minId]){
                    isTrue = false;
                    break;
                }
            }
            if (isTrue){
                arr.add(matrix[i][minId]);
            }
        }
        return arr;
    }
}
