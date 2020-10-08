package ru.job4j.collection;

import java.util.Comparator;

/**
 * Для сортировки по убыванию реализуйте отдельный компаратор.
 *
 * 1. Разделить с помощью split входящие строки по "/" результат разделения поместите в переменные, это будут массивы.
 *
 * 2. Сравните первые элементы полученных массивов с помощью compareTO() по убыванию, результат сравнения поместите в переменную rsl
 *
 * 3. если переменная rsl не равна 0 - возвратите ее, иначе - верните результат сравнения входящих строк по возрастанию
 */
public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String or1, String or2) {
        String[] first = or1.split("/");
        String[] second = or2.split("/");
        int rsl = second[0].compareTo(first[0]);
        return rsl == 0 ? or1.compareTo(or2) : rsl;
    }
}


