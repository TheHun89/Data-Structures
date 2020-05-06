package com.example.datastructures.LinkedList;

public class LinkedListDemo {

    public Node createNodesList(int n) {
        Node head = new Node("1");
        Node current = head;

        for (int i = 2; i <= n; i++) {
            Node newNode = new Node(String.valueOf(i));
            current.setNext(newNode);
//            System.out.println("currentNode is " + current + " and next is " + current.getNext());
            current = newNode;
        }
//        System.out.println("currentNode is " + current + " and next is " + current.getNext());
        return head;
    }

    public Node createNodeManually() {
        Node head = new Node("A");
        head.setNext(new Node("B"));
        head.getNext().setNext(new Node("C"));
        head.getNext().getNext().setNext(new Node("D"));

        return head;
        //System.out.println("marvels: " + head + head.getNext() + head.getNext().getNext());
    }

    public Node reverseIterative(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public Node reverseRecursive(Node head) {

        if(head == null) { return head; }

        // last node or only one node
        if(head.getNext() == null) {
            return head;
        }
        Node newHeadNode = reverseRecursive(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);

        return newHeadNode;
    }

    //Checks whether the value x is present in linked list - iterative
    public boolean containsValueIterative(Node head, String x)
    {
        Node current = head;    //Initialize current
        while (current != null)
        {
            if (current.getData().equals(x))
                return true;    //data found
            current = current.getNext();
        }
        return false;
    }

    //Checks whether the value x is present in linked list - recursive
    public boolean containsValueRecursive(Node head, String x) {

        if (head == null) { return false; }
        if (head.getData().equals(x)) { return true; }
        return containsValueRecursive(head.getNext(), x);
    }

    public Node removeDuplicatesIterative(Node head) {

        Node currentNode = head;

        while(head != null) {
            while (currentNode != null && currentNode.getData().equals(head.getData())) {
                currentNode = currentNode.getNext();
            }
            head.setNext(currentNode);
            head = head.getNext();
            //currentNode = currentNode.getNext();
        }
        return head;
    }

    public Node removeDuplicatesRecursive(Node head) {

    /* Pointer to store the pointer
    of a node to be deleted*/
        Node to_free;

        /* do nothing if the list is empty */
        if (head == null)
            return null;

        /* Traverse the list till last node */
        if (head.getNext() != null)
        {
            /* Compare head node with next node */
            if (head.getData() == head.getNext().getData())
            {
            /* The sequence of steps is important.
            to_free pointer stores the next of head
            pointer which is to be deleted.*/
                to_free = head.getNext();
                head.setNext(head.getNext().getNext());
                removeDuplicatesRecursive(head);

            } else { /* This is tricky: only advance if no deletion */
                removeDuplicatesRecursive(head.getNext());
            }
        }
        return head;
    }

    public Object getNthElementIterative(Node head, int i) {

        int count = 0;

        while (head != null) {
            if (count == i) {
                return head.getData();
            }
            head = head.getNext();
            count++;
        }
        return null;
    }

    public Object getNthElementRecursive(Node head, int i) {

        int count = 1;

        if (count == i) {
            return head.getData();
        } else {
            return getNthElementRecursive(head.getNext(), i);
        }
    }

    /** https://www.geeksforgeeks.org/merge-two-sorted-linked-lists/ **/
    /** NOTE: we return merged.getNext to cut off the first dummy node **/
    public Node mergeTwoSortedLinkedListsIterative(Node<Integer> a, Node<Integer> b) {

        Node merged = new Node();
        Node tail = merged;

        while (a != null || b != null) {

            if (a == null) {
                tail.setNext(b);
                return merged.getNext();
            }

            if (b == null) {
                tail.setNext(a);
                return merged.getNext();
            }

            if (a.getData() < b.getData()) {
                tail.setNext(a);
                tail = tail.getNext();
                a = a.getNext();
            } else {
                tail.setNext(b);
                tail = tail.getNext();
                b = b.getNext();
            }
        }
        return merged.getNext();
    }

    public Node mergeTwoSortedLinkedListsRecursive(Node<Integer> a, Node<Integer> b) {

        if (a == null) { return b; }
        if (b == null) { return a; }

        if (a.getData() < b.getData()){
            a.setNext(mergeTwoSortedLinkedListsRecursive(a.getNext(), b));
            return a;
        } else {
            b.setNext(mergeTwoSortedLinkedListsRecursive(a, b.getNext()));
            return b;
        }
    }

    public void printList(Node node)
    {
        System.out.print("print list: ");
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }
}
