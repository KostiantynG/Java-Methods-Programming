package com.tasks.OneWayList;

public class Node {
    int data;
    Node next;
    Node insertInTail(Node head, int data){
        Node node = new Node();
        if(head)
        node.data = data;
        node.next = head;
        return node;
    }
}

