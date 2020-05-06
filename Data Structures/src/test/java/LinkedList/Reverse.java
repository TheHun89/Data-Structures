package LinkedList;

import com.example.datastructures.LinkedList.LinkedListDemo;
import com.example.datastructures.LinkedList.Node;
import org.junit.Test;

public class Reverse {

    @Test
    public void testIterative() {

        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.createNodesList(5);
        Node node = linkedListDemo.createNodeManually();

        System.out.println("node is:");
        linkedListDemo.printList(node);

        node = linkedListDemo.reverseIterative(node);
        System.out.println("reversed node is:");
        linkedListDemo.printList(node);
    }

    @Test
    public void testRecursive() {

        LinkedListDemo linkedListDemo = new LinkedListDemo();
        Node node = linkedListDemo.createNodeManually();
        System.out.println("node is:");
        linkedListDemo.printList(node);

        node = linkedListDemo.reverseRecursive(node);
        System.out.println("reversed node is:");
        linkedListDemo.printList(node);
    }
}
