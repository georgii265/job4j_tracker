package ru.job4j.collection;

import java.util.HashSet;

public class hashSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
            if (hashSet.add("Hello")) {
                hashSet.add("Hello");
                hashSet.add("Name");
                hashSet.add("Ivan");
                hashSet.add("is");
            }
            System.out.println(hashSet);
        }
    }
