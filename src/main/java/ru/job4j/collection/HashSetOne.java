package ru.job4j.collection;

import java.util.HashSet;

public class HashSetOne {
    public static void main(String[] args) {
        java.util.HashSet<String> hashSet = new java.util.HashSet<>();
        if (hashSet.add("Hello")) {
            hashSet.add("Hello");
            hashSet.add("Name");
            hashSet.add("Ivan");
            hashSet.add("is");
        }
        System.out.println(hashSet);
    }
}
