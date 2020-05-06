package com.example.datastructures.LinkedList;

/** https://www.baeldung.com/java-circular-linked-list **/
public class CircularLinkedList {

    private Node head;
    private Node tail;

    public void add(String s) {

        Node newNode = new Node(s);

        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        tail.setNext(head);
    }

    public void printList(Node head)
    {
        Node currentNode = head;
        System.out.print("print list: ");

        do {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        while (currentNode != head);

        System.out.println();
    }

    /** Getters and Setters **/
    public void setHead(Node node) {
        this.head = node;
    }

    public Node getHead() {
        return head;
    }

    public void setTail(Node node) {
        this.tail = node;
    }

    public Node getTail() {
        return tail;
    }
}
