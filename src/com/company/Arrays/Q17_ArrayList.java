//unknown number of size.

package com.company.Arrays;

import java.util.ArrayList;

public class Q17_ArrayList {
    public static void main(String[] args) {
       //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(48);
        list.add(89);
        list.add(671);
        list.add(458);

        System.out.println(list);

        System.out.println(list.contains(67));

        list.set(0, 99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        
    }
}
