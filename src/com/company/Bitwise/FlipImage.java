// https://leetcode.com/problems/flipping-an-image

package com.company.Bitwise;

public class FlipImage {
    public static void main(String[] args) {
        int image[][] ={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(flipAndInvertImage(image));
    }

    public static int[][] flipAndInvertImage(int image[][]){
        for (int row[] : image){
            //reverse these array
            for (int i=0; i<(image[0].length+1)/1; i++){
                //swap
                int temp = row[i] ^1;
                row[i] = row[image[0].length-i-1] ^1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    }
}
