package ru.job4j.collection;

import java.util.Comparator;

/**
 * по имени и по убыванию.
 * Чтобы обеспечить сортировку по убыванию, в компараторе мы сравниваем второй параметр с первым.
 */
public class JobByNameReverse implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

