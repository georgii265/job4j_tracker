package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Чтобы обеспечить сортировку по возростанию, в компараторе мы сравниваем первый параметр со вторым,
 */
public class SortByNameItem implements Comparator<Item> {

    @Override
    public int compare(Item first,Item second) {
        return first.getName().compareTo(second.getName());
    }
}
