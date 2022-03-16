package com.company.BinarySearch;
//

public class Q13_CountNegatives {
    public static void main(String[] args) {
        int grid [][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println("Total negative numbers are: "+negativeNumbers(grid));

    }

    public static int negativeNumbers(int grid[][]){
        int rows = grid.length;
        int cols = grid[0].length;
        int res=0, lastNeg=cols-1;

        for (int row=0; row<rows; row++) {

            if (grid[row][0] < 0) {
                res += cols;
                continue;
            }
            if (grid[row][cols - 1] > 0) {
                continue;
            }

            int l = 0, r = lastNeg;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (grid[row][m] < 0) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
                res += (cols - l);
                lastNeg = l;
            }
        }
        return res;
    }
}
