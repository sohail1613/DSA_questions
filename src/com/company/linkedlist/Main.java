package com.company.linkedlist;

public class Main {
    public static void main(String[] args) {
        CustomLinkedlist customLinkedlist = new CustomLinkedlist();
        customLinkedlist.insertFirst(2);
        customLinkedlist.insertFirst(4);
        customLinkedlist.insertFirst(6);
        customLinkedlist.insertFirst(9);
        customLinkedlist.insertFirst(21);

        customLinkedlist.display();
    }
}
