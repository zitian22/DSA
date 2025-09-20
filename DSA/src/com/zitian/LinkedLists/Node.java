package com.zitian.LinkedLists;

public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return this.value;
    }
}
