package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {

    /**
     * ArrayList - автоматически расширяемый массив.
     * Вы можете работать с массивом, но при этом не используются квадратные скобки.
     * создайте нужный объект, вставьте объект методом add();
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");

        for (String string : names) {
            System.out.println(string);
        }
    }
}

