package LinkedList;

import com.example.datastructures.LinkedList.LinkedListDemo;
import com.example.datastructures.LinkedList.Node;
import org.junit.Test;

public class MergeTwoSorted {

    @Test
    public void test() {

        LinkedListDemo linkedListDemo = new LinkedListDemo();

        Node head1 = new Node(5);
        head1.setNext(new Node(8));
        head1.getNext().setNext(new Node(15));
        head1.getNext().getNext().setNext(new Node(20));

        Node head2 = new Node(6);
        head2.setNext(new Node(8));
        head2.getNext().setNext(new Node(11));
        head2.getNext().getNext().setNext(new Node(12));

        System.out.println("Nodes before merged:  ");
        linkedListDemo.printList(head1);
        linkedListDemo.printList(head2);
        System.out.println("Nodes after merged:  ");
        linkedListDemo.printList(linkedListDemo.mergeTwoSortedLinkedListsRecursive(head1, head2));
    }
}
