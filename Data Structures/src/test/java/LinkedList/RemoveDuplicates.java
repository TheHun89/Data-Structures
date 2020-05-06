package LinkedList;

import com.example.datastructures.LinkedList.LinkedListDemo;
import com.example.datastructures.LinkedList.Node;
import org.junit.Test;

public class RemoveDuplicates {

    @Test
    public void testIterative() {

        LinkedListDemo linkedListDemo = new LinkedListDemo();
        Node head = new Node("A");
        head.setNext(new Node("B"));
        head.getNext().setNext(new Node("B"));
        head.getNext().getNext().setNext(new Node("D"));
        System.out.println("before removing duplicates:");
        linkedListDemo.printList(head);
        linkedListDemo.removeDuplicatesIterative(head);
        System.out.println("after removing duplicates:");
        linkedListDemo.printList(head);
    }

    @Test
    public void testRecursive() {

        LinkedListDemo linkedListDemo = new LinkedListDemo();
        Node head = new Node("A");
        head.setNext(new Node("B"));
        head.getNext().setNext(new Node("B"));
        head.getNext().getNext().setNext(new Node("D"));
        System.out.println("before removing duplicates recursive:");
        linkedListDemo.printList(head);
        linkedListDemo.removeDuplicatesRecursive(head);
        System.out.println("after removing duplicates recursive:");
        linkedListDemo.printList(head);
    }
}
