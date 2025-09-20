package com.zitian.LinkedLists;

public class Main {
    public static void main(String[] args) throws Exception{
        LinkedList list = new LinkedList();
        Node node1 = new Node(20);
        Node node2 = new Node(10);
        Node node3 = new Node(30);
        Node node5 = new Node(40);

        list.addFirst(node1);
        list.addFirst(node2);
        list.addLast(node3);

        System.out.println(list.indexOf(node5));
        System.out.println(list.contains(4));


        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();


    }
}
