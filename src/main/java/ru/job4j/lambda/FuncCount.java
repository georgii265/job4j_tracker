package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


class FuncCount {

    public static List<Double> diapason(int start, int finich, Function<Double, Double> func) {
        List<Double> count = new ArrayList<>();
        for (int i = start; i != finich; i++) {
            count.add(func.apply((double)i));
        }
        return count;
    }
}
