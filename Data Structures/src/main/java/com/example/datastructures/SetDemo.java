package com.example.datastructures;

import java.util.HashSet;

public class SetDemo {

    public void process () {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<String>();

        // add elements to HashSet
        hashSet.add("geeks");
        hashSet.add("for");
        hashSet.add("allen");
        hashSet.add("practice");
        hashSet.add("contribute");

        System.out.println(hashSet);

        // Duplicate removed
        hashSet.add("geeks");

        // Displaying HashSet elements
        System.out.println("HashSet contains: ");
        for (String temp : hashSet) {
            System.out.println(temp);
        }
    }
}
