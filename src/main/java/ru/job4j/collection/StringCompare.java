package ru.job4j.collection;

import java.util.Comparator;

/**
 * Понадобится цикл, чтобы поэлементно сравнить строки, чтобы не вывалиться за пределы массива
 * - нужно будет сравнить две строки с помощью Math.min() и это будет количество итераций в цикле.
 * Внутри цикла будете поэлементно сравнивать символы строк с помощью Character.compare(),
 * извлекать символы будем с помощью charAt()
 * - если такое сравнение вернуло отлично от 0 значение - значит сразу можем вернуть это значение.
 * После цикла если окажется что сравнение символов так и осталось равным 0,
 * т.е. все символы одинаковые - значит мы возвращаем сравнение длины строк с помощью Integer.compare()
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int list = 0;
        for (int index = 0; index < Math.min(left.length(), right.length()); index++) {
            list = Character.compare(left.charAt(index), right.charAt(index));
            if (list != 0) {
                break;
            }
        }
        if (list == 0) {
            list = Integer.compare(left.length(), right.length());
        }
        return list;
    }
}