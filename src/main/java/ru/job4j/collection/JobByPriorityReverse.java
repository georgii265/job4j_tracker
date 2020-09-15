package ru.job4j.collection;

import java.util.Comparator;

/**
 * по приоритету и по убыванию
 * Чтобы обеспечить сортировку по убыванию, в компараторе мы сравниваем второй параметр с первым.
 */
public class JobByPriorityReverse implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(),o2.getPriority());
    }
}

