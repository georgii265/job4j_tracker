package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, -1, 2, -2, 3, -3));
        List<Integer> bugs = integers.stream().filter(
                rsl -> rsl > 0
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);
    }
}

