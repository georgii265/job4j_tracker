package ru.job4j.collection;

import java.util.Comparator;
import static java.lang.Integer.parseInt;

/**
 * метод split()
 * - возвращает массив строк, вычисленных путем разделения данной строки вокруг данного регулярного выражения.
 * метод parseInt()
 * - используется для перевода строки в целое число.
 */
public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left,String right) {
        String[] leftNum = left.split(". ");
        String[] rightNum = right.split(". ");
        int leftNumber = parseInt(leftNum[0]);
        int rightNumber = parseInt(rightNum[0]);
        return Integer.compare(leftNumber, rightNumber);
    }
}
