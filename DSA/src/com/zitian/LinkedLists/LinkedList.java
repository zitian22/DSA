package com.zitian.LinkedLists;

public class LinkedList {
    private Node first;
    private Node last;
    private int count;


    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public void addFirst(Node node) {
        node.setNext(this.first);
        this.first = node;
        if (this.last == null)
            this.last = node;
        count++;
    }

    public void addLast(Node node) {
        this.last.setNext(node);
        this.last = node;
        if (this.first == null)
            this.first = node;
        count++;
    }

    public void deleteFirst() {
        if (this.first != null) {
            Node tempNode = this.first;
            this.first = this.first.getNext();
            tempNode.setNext(null);
            count--;
        }
    }
 
    public void deleteLast() {
        if (this.last != null) {
            Node tempNode = this.first;
            for (int i = 1; i < count; i++) {
                tempNode = tempNode.getNext();
            }
            this.last = tempNode;
            this.last.setNext(null);
        }
    }

    public int contains(int index) {
        Node tempNode = this.first;
        for (int i = 1; i <= count; i++) {
            if (i == index) {
                return tempNode.getValue();
            }
            tempNode = tempNode.getNext();
        }
        return -1;
    }

    public int indexOf(Node node) {
        Node tempNode = this.first;
        for (int i = 1; i <= count; i++) {
            if (tempNode == node) {
                return i;
            }
            tempNode = tempNode.getNext();
        }
        return -1;
    }


}