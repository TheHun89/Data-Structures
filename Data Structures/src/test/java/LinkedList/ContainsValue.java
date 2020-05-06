package LinkedList;

import com.example.datastructures.LinkedList.LinkedListDemo;
import com.example.datastructures.LinkedList.Node;
import org.junit.Assert;
import org.junit.Test;

public class ContainsValue {

    @Test
    public void testIterative() {

        LinkedListDemo linkedListDemo = new LinkedListDemo();
        Node node = linkedListDemo.createNodeManually();
        Assert.assertTrue( linkedListDemo.containsValueIterative(node, "A"));
    }

    @Test
    public void testRecursive() {

        LinkedListDemo linkedListDemo = new LinkedListDemo();
        Node node = linkedListDemo.createNodeManually();
        Assert.assertFalse( linkedListDemo.containsValueRecursive(node, "BB"));
    }
}
