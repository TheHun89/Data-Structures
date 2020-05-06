package com.example.datastructures;

import java.util.Arrays;
import java.util.HashMap;

public class StringDemo {

    // https://www.geeksforgeeks.org/string-vs-stringbuilder-vs-stringbuffer-in-java/

    public StringBuilder duplicateCharacters( String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (char c: s.toLowerCase().toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
                System.out.println(c + " is a duplicate");
                stringBuilder.append(c);
            } else {
                hashMap.put(c, 1);
            }
        }

        return stringBuilder;
    }

    // https://www.baeldung.com/java-strings-anagrams
    // O(NlogN)
    public boolean isAnagram( String first, String second ) {
        if (first.length() != second.length()) { return false;}

        char[] firstArray = first.toLowerCase().toCharArray();
        char[] secondArray = second.toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        System.out.println(firstArray);
        System.out.println(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

    // Cheat - new StringBuilder(s).reverse().toString() or new StringBuffer(s).reverse().toString();
    // Time Complexity : O(n)
    public String reverseStringIteration( String s ) {
        int start = 0;
        int end = s.length() - 1;
        s = s.replace("1", "");
        /*
        char[] exampleArray = s.toCharArray();

        while (start < end) {
            char temp = exampleArray[start];
            exampleArray[start] = exampleArray[end];
            exampleArray[end] = temp;
            start++;
            end--;
        }
        return new String(exampleArray);
        */

        // NOTE: String are immutable in Java (can't be changed);
        // use StringBuilder, StringBuffer or CharArray (or create a new string)
        StringBuilder stringBuilder = new StringBuilder(s);

        while (start < end) {
            char temp = s.charAt(start);
            stringBuilder.setCharAt(start,stringBuilder.charAt(end));
            stringBuilder.setCharAt(end, temp);
            start++;
            end--;
        }
        return new String(stringBuilder);
    }

    // NOTE: run through Debugger for better understanding
    public String reverseStringRecursion( String s) {
        if (s.isEmpty()) { return s; }
        return reverseStringRecursion(s.substring(1)) + s.charAt(0);
    }

    public int numberOfWords( String s ) {
        int count = 0;

        //Trim whitespace from beginning and end of string
        s = s.trim();

        //Necessary because foreach will execute once with empty string returning 1
        if (s == "") { return 0; }

        //Ensure there is only one space between each word in the passed string
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }

        for (String y: s.split(" ")) {
            count++;
        }
        return count;
    }

    public boolean isPalindrome( String s ) {
        s = s.trim().toLowerCase().replace(" ", "");
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if(s.charAt(start) != s.charAt(end)) { return false; }
            start++;
            end--;
        }
        return true;
    }

    public StringBuilder removeDuplicates( String s ) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder(s.toLowerCase());

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (hashMap.containsKey(stringBuilder.charAt(i))) {
                stringBuilder.replace(i, i + 1, "");
            } else {
                hashMap.put(stringBuilder.charAt(i), 1);
            }
        }
        return stringBuilder;
    }

    public boolean allUniqueCharacters( String s ) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c: s.toLowerCase().toCharArray()) {
            if (hashMap.containsKey(c)) {
                return false;
            } else {
                hashMap.put(c, 1);
            }
        }
        return true;
    }

    public void findAllSubstringsInString( String s) {

    }
}
