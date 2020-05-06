package LinkedList;

import com.example.datastructures.LinkedList.CircularLinkedList;
import org.junit.Test;

public class PrintCircularLinkedList {

    @Test
    public void test() {

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add("A");
        circularLinkedList.add("B");
        circularLinkedList.add("C");
        System.out.println("Circular linked list is:");
        circularLinkedList.printList(circularLinkedList.getHead());
    }
}
