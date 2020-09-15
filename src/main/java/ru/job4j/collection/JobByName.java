package ru.job4j.collection;

import java.util.Comparator;

/**
 * по имени и по возрастанию.
 * Чтобы обеспечить сортировку по возрастанию,
 * в компараторе мы сравниваем первый параметр со вторым,
 */
public class JobByName implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
