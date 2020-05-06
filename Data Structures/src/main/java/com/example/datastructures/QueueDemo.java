package com.example.datastructures;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public void process() {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();

        // Adding items to the pQueue using add()
        pQueue.add("C");
        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");

        // Printing the most priority element - C
        System.out.println("Head value using peek function:"
                + pQueue.peek());

        System.out.println("the priority queue size is " + pQueue.size());

    }
}
