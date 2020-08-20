package ru.job4j.lessonArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GFG {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кременчуг");
        queue.offer("Львов");

        System.out.println(queue.peek());

        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
    }
//        LinkedList<String> names = new LinkedList<>();
//        names.add(0," Petr");
//        names.add(1," Ivan");
//        names.add(2," Egor");
//        names.add(3," Andrei");
//        names.add(4," Dima");
//
//        for( String value : names) {
//            System.out.print(value);
       // ArrayList<Integer> names = new ArrayList<>();

//        names.add(23);
//        names.add(32);
//        names.add(45);
//        names.add(63);
//        names.add(23);
//        names.add(32);
//
//        names.removeIf(n -> (n % 4 == 0));
//
//        for (int i : names) {
//            System.out.println(i);
        }


