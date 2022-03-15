package com.company.BinarySearch;

public class Q7_PerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        boolean answer = isPerfectSquare(num);
        System.out.println(answer);
    }

    public static boolean isPerfectSquare(int num) {
        int low=1; int high=num;long mid=-1;
        while(low<=high){
            mid = low +(high-low)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid>num){
                high=(int)mid-1;
            }
            else{
                low=(int)mid+1;
            }
        }
        return false;
    }
}
