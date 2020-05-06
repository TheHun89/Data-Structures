package com.example.datastructures;

import java.util.Stack;

// https://www.baeldung.com/java-stack
public class StackDemo {

    public void process() {

        Stack stack = new Stack();

        stack.push("hello");
        stack.push(99);
        stack.push("Java is fun");
        stack.push(null);
        stack.push(null);
        System.out.println("the stack is - " + stack);
        System.out.println("stack size is " + stack.size());
        System.out.println("stack.index(99) is " + stack.indexOf(99));  // 1
        System.out.println("stack.pop is " + stack.pop());
        System.out.println("stack.peep is " + stack.peek());
        System.out.println("stack.search(99) is " + stack.search(99));
        System.out.println("stack.empty is " + stack.empty());
    }
}
