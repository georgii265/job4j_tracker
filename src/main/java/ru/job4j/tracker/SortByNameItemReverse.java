package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Чтобы обеспечить сортировку по убыванию, в компараторе мы сравниваем второй параметр с первым.
 */
public class SortByNameItemReverse implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }
}
