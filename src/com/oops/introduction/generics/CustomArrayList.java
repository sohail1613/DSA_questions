package com.oops.introduction.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_VALUE = 10; //also working as index value
    private int size =0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_VALUE];
    }

    public void add(int num){
        if (this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        //copy the current item in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data" + Arrays.toString(data) +
                ", size=" + size +
                '}';

    }


    public static void main(String[] args) {
        //ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.add(8);
        list.add(4);

        System.out.println(list);

    }
}
