//unknown number of size.

package com.company.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Q17_ArrayList {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);

       //syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(67);
//        list.add(48);
//        list.add(89);
//        list.add(671);
//        list.add(458);
//
//        System.out.println(list);
//
//        System.out.println(list.contains(67));
//
//        list.set(0, 99);
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);

        //input
        for (int i=0; i<5; i++){
            list.add(es.nextInt());
        }

        //get item at any index
        for (int i=0; i<5; i++){
            System.out.println(list.get(i));  //pass index here
        }
        System.out.println(list);
    }
}
