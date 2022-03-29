package com.company.Recursion;
//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

/*Approach:
Get the array for which the minimum is to be found
Recursively find the minimum according to the following:
Recursively traverse the array from the end
Base case: If the remaining array is of length 1, return the only present element i.e. arr[0]
if(n == 1)
   return arr[0];
Recursive call: If the base case is not met, then call the function by passing the array of one size less from the end, i.e. from arr[0] to arr[n-1].
Return statement: At each recursive call (except for the base case), return the minimum of the last element of the current array (i.e. arr[n-1]) and the element returned from the previous recursive call.
return min(arr[n-1], recursive_function(arr, n-1));
Print the returned element from the recursive function as the minimum element*/

public class Q19_MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println("Minimum element is: "+min(arr, arr.length-1));
        System.out.println("Maximum element is: "+max(arr, arr.length-1));
    }

    static int min(int[] arr, int n){
        //base condition
        if (n == 1){
            return arr[0];
        }

        return Math.min(arr[n-1], min(arr, n-1));
    }

    static int max(int[] array, int n){
        if (n == 1){
            return array[0];
        }

        return Math.max(array[n-1], max(array, n-1));
    }
}
