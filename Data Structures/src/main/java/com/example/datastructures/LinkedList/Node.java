package com.example.datastructures.LinkedList;

public class Node<G> {

    private Node next;
    private G data;

    public Node() {}
    public Node(G data) {
        this.data = data;
    }

    public boolean hasNext() {
        return next != null;
    }

    /* Getters and Setters */
    public G getData() {
        return data;
    }

    public void setData(G data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

//    public G toString() {
//        return this.data;
//    }
}
