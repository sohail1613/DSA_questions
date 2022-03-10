//Lucky Numbers in a Matrix

package com.company.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Q25_LuckyMatrixNumber {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> output = luckyNumbers(matrix);
        if(output.size() > 0)
            System.out.print(output.get(0));

    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            int minId=0;
            int min=999999;

            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    minId = j;
                }
            }
            boolean isTrue = true;
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][minId] < matrix[j][minId]){
                    isTrue = false;
                    break;
                }
            }

            if(isTrue){
                arr.add(matrix[i][minId]);
            }
        }
        return arr;
    }
}
